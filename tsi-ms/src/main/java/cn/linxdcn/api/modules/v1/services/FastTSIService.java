package cn.linxdcn.api.modules.v1.services;

import cn.linxdcn.api.modules.v1.DTO.FastTSIDTO;
import cn.linxdcn.api.modules.v1.DTO.TSIResultDTO;

import java.util.Arrays;

public class FastTSIService {
    // index order:
    // sett, settd, cov, dl, dc, ds

    // The maximum value for the index
    static double[] max = {7.74, 30, 12, 1, 0.5, 0.5};
    static double[] min = {0, 0, 0, 0, 0, 0};

    // The mean value of the sample
    static double[] mu = {5.2, 17.2, 6.1, 1.3, 0.5, 0};

    // The std value of the sample
    static double[] std = {3.1, 13.4, 2.2, 1.8, 0.9, 0.1};

    // The default coefficient
    static double[] coefficient = {-0.62, -0.13, -0.25, -0.19, -0.06, -0.03};

    // FastTSIService info
    static double tsiMu = 3.6;
    static double tsiStd = 0.8;

    public static TSIResultDTO calc(FastTSIDTO tsiDTO) {
        double[] input = {Math.sqrt(tsiDTO.getSett()), tsiDTO.getSettDiff(), tsiDTO.getConv(),
                tsiDTO.getLeakage(), tsiDTO.getCrack(), tsiDTO.getSpall()};
        double[] inputStd = getStdInput(input);

        double[] coef = Arrays.copyOfRange(coefficient, 0, coefficient.length);

        if (tsiDTO.isDynamic()) {
            coef = changeCoef(input, coef);
        }

        double tsiNor = 0;
        for (int i = 0; i < input.length; i++) tsiNor += coef[i] * inputStd[i];

        double tsi = tsiNor * tsiStd + tsiMu;
        return new TSIResultDTO(tsi);
    }

    static double[] getStdInput(double[] input) {
        double[] res = new double[input.length];
        for (int i = 0; i < input.length; i++) {
            res[i] = (input[i] - mu[i]) / std[i];
        }
        return res;
    }

    static double[] changeCoef(double[] input, double[] coef) {
        int len = input.length;
        double totalCoef = 0;
        for(double co : coef) {totalCoef += co;}
        double[] initWeight = new double[len];
        double[] g = new double[len];
        double[] d = new double[len];
        double[] newWeight = new double[len];

        for(int i = 0; i < len; i++) {
            initWeight[i] = coef[i] / totalCoef;
        }

        for(int i = 0; i < len; i++) {
            if(input[i] > max[i] || input[i] < min[i]) g[i] = 0;
            else {
                g[i] = 1 - ((input[i] - min[i]) / (max[i] - min[i])) *
                        Math.exp((input[i] - min[i]) / (max[i] - min[i]) - 1);
            }
        }

        for(int i = 0; i < len; i++) {
            if(g[i] >= 0.8) d[i] = 1;
            else {
                d[i] = Math.pow(2.5, 4 - 5 * g[i]);
            }
        }

        double totalNewWeight = 0;
        for(int i = 0; i < len; i++) {
            totalNewWeight += initWeight[i] * d[i];
        }

        for(int i = 0; i < len; i++) {
            newWeight[i] = initWeight[i] * d[i] / totalNewWeight;
        }

        double[] newCoef = new double[len];
        for(int i = 0; i < len; i++) {
            newCoef[i] = totalCoef * newWeight[i];
        }
        return newCoef;
    }
}

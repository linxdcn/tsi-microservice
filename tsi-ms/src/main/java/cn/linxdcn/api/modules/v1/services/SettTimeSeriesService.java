package cn.linxdcn.api.modules.v1.services;

import cn.linxdcn.api.modules.v1.DTO.SettSeriesDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class SettTimeSeriesService {
    public SettSeriesDTO predict(SettSeriesDTO settSeriesDTO) {
        ArrayList<Double> origin = settSeriesDTO.getSeries();
        if(origin.size() < 6) return settSeriesDTO;

        ArrayList<Double> pred = new ArrayList<>();
        for(int i = 0; i < origin.size() + settSeriesDTO.getPredictNum(); i++) {
            if(i < 5) {
                pred.add(0.0);
            } else {
                double tmp = 0;
                tmp += 1.11 * getItem(origin, pred, i - 1);
                tmp += 0.18 * getItem(origin, pred, i - 2);
                tmp += -0.2 * getItem(origin, pred, i - 3);
                tmp += 0.42 * getItem(origin, pred, i - 4);
                tmp += -0.51 * getItem(origin, pred, i - 5);
                pred.add(tmp);
            }
        }

        SettSeriesDTO res = new SettSeriesDTO();
        res.setSeries(pred);
        res.setPredictNum(settSeriesDTO.getPredictNum());
        return res;
    }

    private double getItem(ArrayList<Double> origin, ArrayList<Double> pred, int num) {
        double res;
        if(num < origin.size()) res = origin.get(num);
        else res = pred.get(num);
        return res;
    }
}

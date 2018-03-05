package cn.linxdcn.api.modules.v1.DTO;

import java.util.ArrayList;

public class SettSeriesDTO {
    private ArrayList<Double> series;
    private int predictNum;

    public void setPredictNum(int predictNum) {
        this.predictNum = predictNum;
    }

    public int getPredictNum() {

        return predictNum;
    }

    public ArrayList<Double> getSeries() {
        return series;
    }

    public void setSeries(ArrayList<Double> series) {
        this.series = series;
    }
}

package cn.linxdcn.api.modules.v1.DTO;

public class TSIResultDTO {
    private double tsi;

    public TSIResultDTO(double tsi) {
        this.tsi = tsi;
    }

    public void setTsi(double tsi) {

        this.tsi = tsi;
    }

    public double getTsi() {

        return tsi;
    }
}

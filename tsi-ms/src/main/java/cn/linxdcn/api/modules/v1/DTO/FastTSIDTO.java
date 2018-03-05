package cn.linxdcn.api.modules.v1.DTO;

public class FastTSIDTO {
    private double sett;
    private double settd;
    private double cov;
    private double dl;
    private double dc;
    private double ds;
    private boolean dynamic;

    public void setSett(double sett) {
        this.sett = sett;
    }

    public void setSettd(double settd) {
        this.settd = settd;
    }

    public void setCov(double cov) {
        this.cov = cov;
    }

    public void setDl(double dl) {
        this.dl = dl;
    }

    public void setDc(double dc) {
        this.dc = dc;
    }

    public void setDs(double ds) {
        this.ds = ds;
    }

    public void setDynamic(boolean dynamic) {
        this.dynamic = dynamic;
    }

    public double getSett() {

        return sett;
    }

    public double getSettd() {
        return settd;
    }

    public double getCov() {
        return cov;
    }

    public double getDl() {
        return dl;
    }

    public double getDc() {
        return dc;
    }

    public double getDs() {
        return ds;
    }

    public boolean isDynamic() {
        return dynamic;
    }
}

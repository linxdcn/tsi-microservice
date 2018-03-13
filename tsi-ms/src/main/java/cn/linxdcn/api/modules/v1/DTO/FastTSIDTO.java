package cn.linxdcn.api.modules.v1.DTO;

public class FastTSIDTO {
    private double sett;
    private double settDiff;
    private double conv;
    private double leakage;
    private double crack;
    private double spall;
    private boolean dynamic;

    public void setSett(double sett) {
        this.sett = sett;
    }

    public void setSettDiff(double settDiff) {
        this.settDiff = settDiff;
    }

    public void setConv(double conv) {
        this.conv = conv;
    }

    public void setLeakage(double leakage) {
        this.leakage = leakage;
    }

    public void setCrack(double crack) {
        this.crack = crack;
    }

    public void setSpall(double spall) {
        this.spall = spall;
    }

    public void setDynamic(boolean dynamic) {
        this.dynamic = dynamic;
    }

    public double getSett() {

        return sett;
    }

    public double getSettDiff() {
        return settDiff;
    }

    public double getConv() {
        return conv;
    }

    public double getLeakage() {
        return leakage;
    }

    public double getCrack() {
        return crack;
    }

    public double getSpall() {
        return spall;
    }

    public boolean isDynamic() {
        return dynamic;
    }
}

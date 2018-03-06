package cn.linxdcn.api.modules.v1.DTO;

public class LoadStructureInputDTO {
    private double radius = 2.925;
    private double thickness = 0.35;
    private double width = 1.2;
    private double density = 2.5;
    private double moe = 35500000;
    private double mu = 0.2;
    private double kground = 2500;
    private double kjoint = 30000;
    private double loadv = 410.35;
    private double loadh1 = 310.90;
    private double loadh2 = 385.37;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public void setMoe(double moe) {
        this.moe = moe;
    }

    public void setMu(double mu) {
        this.mu = mu;
    }

    public void setKground(double kground) {
        this.kground = kground;
    }

    public void setKjoint(double kjoint) {
        this.kjoint = kjoint;
    }

    public void setLoadv(double loadv) {
        this.loadv = loadv;
    }

    public void setLoadh1(double loadh1) {
        this.loadh1 = loadh1;
    }

    public void setLoadh2(double loadh2) {
        this.loadh2 = loadh2;
    }

    public double getRadius() {

        return radius;
    }

    public double getThickness() {
        return thickness;
    }

    public double getWidth() {
        return width;
    }

    public double getDensity() {
        return density;
    }

    public double getMoe() {
        return moe;
    }

    public double getMu() {
        return mu;
    }

    public double getKground() {
        return kground;
    }

    public double getKjoint() {
        return kjoint;
    }

    public double getLoadv() {
        return loadv;
    }

    public double getLoadh1() {
        return loadh1;
    }

    public double getLoadh2() {
        return loadh2;
    }
}

package cn.linxdcn.api.modules.v1.DTO;

import java.util.ArrayList;

public class LoadStructureOutputDTO {
    public class LoadStructureItem {
        private double x;
        private double y;
        private double z;
        private double moment;
        private double axial;
        private double shear;

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public double getZ() {
            return z;
        }

        public double getMoment() {
            return moment;
        }

        public double getAxial() {
            return axial;
        }

        public double getShear() {
            return shear;
        }

        public void setX(double x) {
            this.x = x;
        }

        public void setY(double y) {
            this.y = y;
        }

        public void setZ(double z) {
            this.z = z;
        }

        public void setMoment(double moment) {
            this.moment = moment;
        }

        public void setAxial(double axial) {
            this.axial = axial;
        }

        public void setShear(double shear) {
            this.shear = shear;
        }
    }

    private ArrayList<LoadStructureItem> results;

    public ArrayList<LoadStructureItem> getResults() {
        return results;
    }

    public void setResults(ArrayList<LoadStructureItem> results) {
        this.results = results;
    }

    public LoadStructureOutputDTO() {
        this.results = new ArrayList<>();
    }
}

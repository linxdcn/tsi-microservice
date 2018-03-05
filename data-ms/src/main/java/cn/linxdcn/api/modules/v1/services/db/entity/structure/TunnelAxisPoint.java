package cn.linxdcn.api.modules.v1.services.db.entity.structure;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by linxiaodong on 4/20/17.
 */
@Entity
@Table(name = "TunnelAxisPoint")
public class TunnelAxisPoint {
    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "LineNo")
    private int lineNo;

    @Column(name = "Milage")
    private double milage;

    @Column(name = "X")
    private double x;

    @Column(name = "Y")
    private double y;

    @Column(name = "Z")
    private double z;

    public TunnelAxisPoint() {
        super();
    }

    public int getId() {
        return id;
    }

    public int getLineNo() {
        return lineNo;
    }

    public double getMilage() {
        return milage;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
}

package cn.linxdcn.api.modules.v1.services.db.entity.structure;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by linxiaodong on 4/20/17.
 */
@Entity
@Table(name = "Tunnel")
public class Tunnel {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID")
    private int id;

    @Column(name = "LineNo")
    private int lineNo;

    @Column(name = "Description")
    private String description;

    @Column(name = "StartMileage")
    private double startMileage;

    @Column(name = "EndMileage")
    private double endMileage;

    @Column(name = "Width")
    private double width;

    @Column(name = "Height")
    private double height;

    @Column(name = "ShapeDesc")
    private String ShapeDesc;

    @Column(name = "Name")
    private String name;

    @Column(name = "ConBeginDate")
    private Date conBeginDate;

    @Column(name = "ConEndDate")
    private Date conEndDate;

    public Tunnel() {
        super();
    }

    public int getId() {
        return id;
    }

    public int getLineNo() {
        return lineNo;
    }

    public String getDescription() {
        return description;
    }

    public double getStartMileage() {
        return startMileage;
    }

    public double getEndMileage() {
        return endMileage;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getShapeDesc() {
        return ShapeDesc;
    }

    public String getName() {
        return name;
    }

    public Date getConBeginDate() {
        return conBeginDate;
    }

    public Date getConEndDate() {
        return conEndDate;
    }
}

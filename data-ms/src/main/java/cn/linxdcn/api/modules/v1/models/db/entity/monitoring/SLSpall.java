package cn.linxdcn.api.modules.v1.models.db.entity.monitoring;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by linxiaodong on 4/20/17.
 */
@Entity
@Table(name = "SLSpall")
public class SLSpall {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "ID")
    private int id;

    @Column(name = "StartMilage")
    private String startMilage;

    @Column(name = "EndMilage")
    private String endMilage;

    @Column(name = "MetroLine")
    private int metroLine;

    @Column(name = "LineNo")
    private int lineNo;

    @Column(name = "StartRingNo")
    private int startRingNo;

    @Column(name = "EndRingNo")
    private int endRingNo;

    @Column(name = "SLCode")
    private String slCode;

    @Column(name = "LocalX")
    private String localX;

    @Column(name = "LocalY")
    private String localY;

    @Column(name = "Shape")
    private String shape;

    @Column(name = "Area")
    private double area;

    @Column(name = "Length")
    private double length;

    @Column(name = "Width")
    private double width;

    @Column(name = "Depth")
    private double depth;

    @Column(name = "Date")
    private Date date;

    @Column(name = "Document")
    private String document;

    @Column(name = "Description")
    private String description;

    public SLSpall() {
        super();
    }

    public int getId() {
        return id;
    }

    public String getStartMilage() {
        return startMilage;
    }

    public String getEndMilage() {
        return endMilage;
    }

    public int getMetroLine() {
        return metroLine;
    }

    public int getLineNo() {
        return lineNo;
    }

    public int getStartRingNo() {
        return startRingNo;
    }

    public int getEndRingNo() {
        return endRingNo;
    }

    public String getSlCode() {
        return slCode;
    }

    public String getLocalX() {
        return localX;
    }

    public String getLocalY() {
        return localY;
    }

    public String getShape() {
        return shape;
    }

    public double getArea() {
        return area;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getDepth() {
        return depth;
    }

    public Date getDate() {
        return date;
    }

    public String getDocument() {
        return document;
    }

    public String getDescription() {
        return description;
    }
}

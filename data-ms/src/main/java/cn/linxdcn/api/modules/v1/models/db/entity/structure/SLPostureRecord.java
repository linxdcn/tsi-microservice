package cn.linxdcn.api.modules.v1.models.db.entity.structure;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by linxiaodong on 4/20/17.
 */
@Entity
@Table(name = "SLPostureRecord")
public class SLPostureRecord {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "ID")
    private int id;

    @Column(name = "LineNo")
    private int lineNo;

    @Column(name = "RingNo")
    private int ringNo;

    @Column(name = "SLHorizontalDeviation")
    private double slHorizontalDeviation;

    @Column(name = "SLElevationalDeviation")
    private double slElevationalDeviation;

    @Column(name = "SLGapUp")
    private double slGapUp;

    @Column(name = "SLGapDown")
    private double slGapDown;

    @Column(name = "SLGapLeft")
    private double slGapLeft;

    @Column(name = "SLGapRight")
    private double slGapRight;

    @Column(name = "SLGap1")
    private double slGap1;

    @Column(name = "SLGap2")
    private double slGap2;

    @Column(name = "SLGap3")
    private double slGap3;

    @Column(name = "SLGap4")
    private double slGap4;

    @Column(name = "SLGap5")
    private double slGap5;

    @Column(name = "SLGap6")
    private double slGap6;

    @Column(name = "SLGap7")
    private double slGap7;

    @Column(name = "SLGap8")
    private double slGap8;

    @Column(name = "HorizontalDiameter")
    private double horizontalDiameter;

    @Column(name = "VerticalDiameter")
    private double verticalDiameter;

    @Column(name = "Diamter1")
    private double diamter1;

    @Column(name = "Diamter2")
    private double diamter2;

    @Column(name = "DeformationDescription")
    private String deformationDescription;

    @Column(name = "SLDate")
    private Date slDate;

    @Column(name = "Uploader")
    private String uploader;

    public SLPostureRecord() {
        super();
    }

    public int getId() {
        return id;
    }

    public int getLineNo() {
        return lineNo;
    }

    public int getRingNo() {
        return ringNo;
    }

    public double getSlHorizontalDeviation() {
        return slHorizontalDeviation;
    }

    public double getSlElevationalDeviation() {
        return slElevationalDeviation;
    }

    public double getSlGapUp() {
        return slGapUp;
    }

    public double getSlGapDown() {
        return slGapDown;
    }

    public double getSlGapLeft() {
        return slGapLeft;
    }

    public double getSlGapRight() {
        return slGapRight;
    }

    public double getSlGap1() {
        return slGap1;
    }

    public double getSlGap2() {
        return slGap2;
    }

    public double getSlGap3() {
        return slGap3;
    }

    public double getSlGap4() {
        return slGap4;
    }

    public double getSlGap5() {
        return slGap5;
    }

    public double getSlGap6() {
        return slGap6;
    }

    public double getSlGap7() {
        return slGap7;
    }

    public double getSlGap8() {
        return slGap8;
    }

    public double getHorizontalDiameter() {
        return horizontalDiameter;
    }

    public double getVerticalDiameter() {
        return verticalDiameter;
    }

    public double getDiamter1() {
        return diamter1;
    }

    public double getDiamter2() {
        return diamter2;
    }

    public String getDeformationDescription() {
        return deformationDescription;
    }

    public Date getSlDate() {
        return slDate;
    }

    public String getUploader() {
        return uploader;
    }
}

package cn.linxdcn.api.modules.v1.models.db.entity.monitoring;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by linxiaodong on 4/20/17.
 */
@Entity
@Table(name = "SLSettlement")
public class SLSettlement {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "ID")
    private int id;

    @Column(name = "Milage")
    private double milage;

    @Column(name = "LineNo")
    private int lineNo;

    @Column(name = "RingNo")
    private int ringNo;

    @Column(name = "InitialElev")
    private double initialElev;

    @Column(name = "Elevation")
    private double elevation;

    @Column(name = "Increasement")
    private double increasement;

    @Column(name = "Total")
    private double total;

    @Column(name = "Rate")
    private double rate;

    @Column(name = "Date")
    private Date date;

    public SLSettlement() {
        super();
    }

    public int getId() {
        return id;
    }

    public double getMilage() {
        return milage;
    }

    public int getLineNo() {
        return lineNo;
    }

    public int getRingNo() {
        return ringNo;
    }

    public double getInitialElev() {
        return initialElev;
    }

    public double getElevation() {
        return elevation;
    }

    public double getIncreasement() {
        return increasement;
    }

    public double getTotal() {
        return total;
    }

    public double getRate() {
        return rate;
    }

    public Date getDate() {
        return date;
    }
}

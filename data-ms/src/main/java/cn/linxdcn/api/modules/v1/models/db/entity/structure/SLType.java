package cn.linxdcn.api.modules.v1.models.db.entity.structure;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by linxiaodong on 4/20/17.
 */
@Entity
@Table(name = "SLType")
public class SLType {
    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "SLTypeName")
    private String slTypeName;

    @Column(name = "SLTypeDescription_CN")
    private String slTypeDescription_CN;

    @Column(name = "SLBaseTypeID")
    private int slBaseTypeID;

    @Column(name = "SLTypeDescription")
    private String slTypeDescription;

    public SLType() {
        super();
    }

    public int getId() {
        return id;
    }

    public String getSlTypeName() {
        return slTypeName;
    }

    public String getSlTypeDescription_CN() {
        return slTypeDescription_CN;
    }

    public int getSlBaseTypeID() {
        return slBaseTypeID;
    }

    public String getSlTypeDescription() {
        return slTypeDescription;
    }
}

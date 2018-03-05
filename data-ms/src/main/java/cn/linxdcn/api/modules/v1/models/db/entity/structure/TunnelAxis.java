package cn.linxdcn.api.modules.v1.services.db.entity.structure;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by linxiaodong on 4/20/17.
 */
@Entity
@Table(name = "TunnelAxis")
public class TunnelAxis {
    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "Name")
    private String name;

    @Column(name = "LineNo")
    private int lineNo;

    public TunnelAxis() {
        super();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getLineNo() {
        return lineNo;
    }
}

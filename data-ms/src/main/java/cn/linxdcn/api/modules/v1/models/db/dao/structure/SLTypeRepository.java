package cn.linxdcn.api.modules.v1.models.db.dao.structure;

import cn.linxdcn.api.modules.v1.models.db.entity.structure.SLType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by linxiaodong on 4/20/17.
 */
public interface SLTypeRepository extends JpaRepository<SLType, Integer>{
    SLType findById(int id);
}

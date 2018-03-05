package cn.linxdcn.api.modules.v1.services.db.dao.structure;

import cn.linxdcn.api.modules.v1.services.db.entity.structure.SLBaseType;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by linxiaodong on 4/19/17.
 */
public interface SLBaseTypeRepository extends JpaRepository<SLBaseType, Integer> {
    SLBaseType findById(int id);
}

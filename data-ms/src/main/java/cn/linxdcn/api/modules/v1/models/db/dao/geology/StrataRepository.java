package cn.linxdcn.api.modules.v1.models.db.dao.geology;

import cn.linxdcn.api.modules.v1.models.db.entity.geology.Strata;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by linxiaodong on 4/6/17.
 */
public interface StrataRepository extends JpaRepository<Strata, Integer>{
    Strata findById(int id);
}

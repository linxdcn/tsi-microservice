package cn.linxdcn.api.modules.v1.models.db.dao.geology;

import cn.linxdcn.api.modules.v1.models.db.entity.geology.StrataSection;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by linxiaodong on 4/6/17.
 */
public interface StrataSectionRepository extends JpaRepository<StrataSection, Integer> {
    StrataSection findById(int id);
}

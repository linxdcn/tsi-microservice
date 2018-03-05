package cn.linxdcn.api.modules.v1.services.db.dao.geology;

import cn.linxdcn.api.modules.v1.services.db.entity.geology.RiverWater;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by linxiaodong on 4/19/17.
 */
public interface RiverWaterRepository extends JpaRepository<RiverWater, Integer> {
    RiverWater findById(int id);
}

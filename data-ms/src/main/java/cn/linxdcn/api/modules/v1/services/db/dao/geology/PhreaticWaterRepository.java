package cn.linxdcn.api.modules.v1.services.db.dao.geology;

import cn.linxdcn.api.modules.v1.services.db.entity.geology.PhreaticWater;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by linxiaodong on 4/17/17.
 */
public interface PhreaticWaterRepository extends JpaRepository<PhreaticWater, Integer>{
    PhreaticWater findById(int id);
}

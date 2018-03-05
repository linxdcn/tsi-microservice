package cn.linxdcn.api.modules.v1.services.db.dao.geology;

import cn.linxdcn.api.modules.v1.services.db.entity.geology.BoreholeStrataInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by linxiaodong on 4/6/17.
 */
public interface BoreholeStrataInfoRepository extends JpaRepository<BoreholeStrataInfo, Integer> {
}

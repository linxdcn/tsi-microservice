package cn.linxdcn.api.modules.v1.models.db.dao.monitoring;

import cn.linxdcn.api.modules.v1.models.db.entity.monitoring.SLCrack;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by linxiaodong on 4/20/17.
 */
public interface SLCrackRepository extends JpaRepository<SLCrack, Integer> {
    List<SLCrack> findByLineNoAndStartRingNo(int lineNo, int startRingNo);
}

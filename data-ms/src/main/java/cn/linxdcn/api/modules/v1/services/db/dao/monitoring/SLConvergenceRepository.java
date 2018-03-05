package cn.linxdcn.api.modules.v1.services.db.dao.monitoring;

import cn.linxdcn.api.modules.v1.services.db.entity.monitoring.SLConvergence;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by linxiaodong on 4/19/17.
 */
public interface SLConvergenceRepository extends JpaRepository<SLConvergence, Integer> {
    List<SLConvergence> findByLineNoAndRingNo(int lineNo, int ringNo);
}

package cn.linxdcn.api.modules.v1.services.db.dao.structure;

import cn.linxdcn.api.modules.v1.services.db.entity.structure.SLPostureRecord;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by linxiaodong on 4/20/17.
 */
public interface SLPostureRecordRepository extends JpaRepository<SLPostureRecord, Integer> {
    SLPostureRecord findByLineNoAndRingNo(int lineNo, int ringNo);
}

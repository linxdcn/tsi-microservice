package cn.linxdcn.api.modules.v1.services.db.dao.structure;

import cn.linxdcn.api.modules.v1.services.db.entity.structure.TunnelAxisPoint;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by linxiaodong on 4/20/17.
 */
public interface TunnelAxisPointRepository extends JpaRepository<TunnelAxisPoint, Integer> {
    List<TunnelAxisPoint> findByLineNo(int lineNo);
}

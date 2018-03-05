package cn.linxdcn.api.modules.v1.models.db.dao.structure;

import cn.linxdcn.api.modules.v1.models.db.entity.structure.Tunnel;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by linxiaodong on 4/20/17.
 */
public interface TunnelRepository extends JpaRepository<Tunnel, Integer> {
    Tunnel findById(int id);
}

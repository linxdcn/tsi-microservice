package cn.linxdcn.api.modules.v1.controllers.db;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import cn.linxdcn.api.modules.v1.services.db.dao.monitoring.*;
import cn.linxdcn.api.modules.v1.services.db.entity.monitoring.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by linxiaodong on 4/19/17.
 */
@RestController
@RequestMapping("api/monitoring")
@Api(value = "Monitoring", description = "The API about Monitoring", tags = "Monitoring")
public class MonitoringController {
    @Autowired
    LeakageRepository leakageRepository;

    @Autowired
    SLConvergenceRepository slConvergenceRepository;

    @Autowired
    SLCrackRepository slCrackRepository;

    @Autowired
    SLSettlementRepository slSettlementRepository;

    @Autowired
    SLSpallRepository slSpallRepository;

    @ApiOperation(notes = "Get Leakage by LineNo and RingNo",
            httpMethod = "GET", value = "Get Leakage")
    @RequestMapping(value = "leakage", method = RequestMethod.GET)
    public List<Leakage> getLeakageByLineNoAndRingNo(
            @RequestParam("lineno") int lineNo,
            @RequestParam("ringno") int ringNo) {
        return leakageRepository.findByLineNoAndStartRingNo(lineNo, ringNo);
    }

    @ApiOperation(notes = "Get Convergence by LineNo and RingNo",
            httpMethod = "GET", value = "Get Convergence")
    @RequestMapping(value = "convergence", method = RequestMethod.GET)
    public List<SLConvergence> getConvergenceByLineNoAndRingNo(
            @RequestParam("lineno") int lineNo,
            @RequestParam("ringno") int ringNo) {
        return slConvergenceRepository.findByLineNoAndRingNo(lineNo, ringNo);
    }

    @ApiOperation(notes = "Get Crack by LineNo and RingNo",
            httpMethod = "GET", value = "Get Crack")
    @RequestMapping(value = "crack", method = RequestMethod.GET)
    public List<SLCrack> getSLCrackByLineNoAndRingNo(
            @RequestParam("lineno") int lineNo,
            @RequestParam("ringno") int ringNo) {
        return slCrackRepository.findByLineNoAndStartRingNo(lineNo, ringNo);
    }

    @ApiOperation(notes = "Get Spall by LineNo and RingNo",
            httpMethod = "GET", value = "Get Crack")
    @RequestMapping(value = "spall", method = RequestMethod.GET)
    public List<SLSpall> getSLSpallByLineNoAndRingNo(
            @RequestParam("lineno") int lineNo,
            @RequestParam("ringno") int ringNo) {
        return slSpallRepository.findByLineNoAndStartRingNo(lineNo, ringNo);
    }

    @ApiOperation(notes = "Get SL Settlement by LineNo and RingNo",
            httpMethod = "GET", value = "Get SL Settlement")
    @RequestMapping(value = "slsettlement", method = RequestMethod.GET)
    public List<SLSettlement> getSLSettlementByLineNoAndRingNo(
            @RequestParam("lineno") int lineNo,
            @RequestParam("ringno") int ringNo) {
        return slSettlementRepository.findByLineNoAndRingNo(lineNo, ringNo);
    }
}

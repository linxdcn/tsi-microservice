package cn.linxdcn.api.modules.v1.controllers.db;

import cn.linxdcn.api.modules.v1.models.db.dao.structure.*;
import cn.linxdcn.api.modules.v1.models.db.entity.structure.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by linxiaodong on 4/19/17.
 */
@RestController
@RequestMapping("api/structure")
@Api(value = "Structure", description = "The API about Structure", tags = "Structure")
public class StructureController {
    @Autowired
    SegmentLiningRepository segmentLiningRepository;

    @Autowired
    SegmentRepository segmentRepository;

    @Autowired
    SLBaseTypeRepository slBaseTypeRepository;

    @Autowired
    SLConstructionRecordRepository slConstructionRecordRepository;

    @Autowired
    SLPostureRecordRepository slPostureRecordRepository;

    @Autowired
    SLTypeRepository slTypeRepository;

    @Autowired
    TunnelAxisRepository tunnelAxisRepository;

    @Autowired
    TunnelAxisPointRepository tunnelAxisPointRepository;

    @Autowired
    TunnelRepository tunnelRepository;

    @ApiOperation(notes = "Get Tunnel Axis by ID", httpMethod = "GET", value = "Get Tunnel Axis by ID")
    @RequestMapping(value = "tunnelaxis/{id}", method = RequestMethod.GET)
    public TunnelAxis getTunnelAxisById(@PathVariable("id") int id) {
        return tunnelAxisRepository.findById(id);
    }

    @ApiOperation(notes = "Get Tunnel Axis Point by ID", httpMethod = "GET",
            value = "Get Tunnel Axis Point by ID")
    @RequestMapping(value = "tunnelaxispoint", method = RequestMethod.GET)
    public List<TunnelAxisPoint> getTunnelAxisPointById(@RequestParam("lineNo") int lineNo) {
        return tunnelAxisPointRepository.findByLineNo(lineNo);
    }

    @ApiOperation(notes = "Get Tunnel by ID", httpMethod = "GET", value = "Get Tunnel by ID")
    @RequestMapping(value = "tunnel/{id}", method = RequestMethod.GET)
    public Tunnel getTunnelById(@PathVariable("id") int id) {
        return tunnelRepository.findById(id);
    }

    @ApiOperation(notes = "Get Segment Lining by ID", httpMethod = "GET", value = "Get Segment Lining by ID")
    @RequestMapping(value = "segmentlining/{id}", method = RequestMethod.GET)
    public SegmentLining getSegmentLiningById(@PathVariable("id") int id) {
        return segmentLiningRepository.findById(id);
    }

    @ApiOperation(notes = "Get Segment by ID", httpMethod = "GET", value = "Get Segment by ID")
    @RequestMapping(value = "segment/{id}", method = RequestMethod.GET)
    public Segment getSegmentById(@PathVariable("id") int id) {
        return segmentRepository.findById(id);
    }

    @ApiOperation(notes = "Get SL Base Type by ID", httpMethod = "GET", value = "Get SL Base Type by ID")
    @RequestMapping(value = "slbasetype/{id}", method = RequestMethod.GET)
    public SLBaseType getSLBaseTypeById(@PathVariable("id") int id) {
        return slBaseTypeRepository.findById(id);
    }

    @ApiOperation(notes = "Get SL Type by ID", httpMethod = "GET", value = "Get SL Type by ID")
    @RequestMapping(value = "sltype/{id}", method = RequestMethod.GET)
    public SLType getSLTypeById(@PathVariable("id") int id) {
        return slTypeRepository.findById(id);
    }

    @ApiOperation(notes = "Get SL Construction Record by ID", httpMethod = "GET",
            value = "Get SL Construction Record by ID")
    @RequestMapping(value = "slconstructionrecord/{id}", method = RequestMethod.GET)
    public SLConstructionRecord getSLConstructionRecordById(@PathVariable("id") int id) {
        return slConstructionRecordRepository.findById(id);
    }

    @ApiOperation(notes = "Get SL Posture Record by LineNo and Ring No", httpMethod = "GET",
            value = "Get SL Posture Record by ID")
    @RequestMapping(value = "slposturerecord", method = RequestMethod.GET)
    public SLPostureRecord getSLConstructionRecordById(
            @RequestParam("lineno") int lineNo,
            @RequestParam("ringno") int ringNo
    ) {
        return slPostureRecordRepository.findByLineNoAndRingNo(lineNo, ringNo);
    }
}

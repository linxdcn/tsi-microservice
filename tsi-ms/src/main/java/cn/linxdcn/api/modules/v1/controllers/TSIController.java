package cn.linxdcn.api.modules.v1.controllers;

import cn.linxdcn.api.modules.v1.DTO.FastTSIDTO;
import cn.linxdcn.api.modules.v1.DTO.SettSeriesDTO;
import cn.linxdcn.api.modules.v1.DTO.TSIResultDTO;
import cn.linxdcn.api.modules.v1.services.FastTSIService;
import cn.linxdcn.api.modules.v1.services.SettTimeSeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/tsi")
public class TSIController {

    @Autowired
    SettTimeSeriesService settTimeSeriesService;

    @RequestMapping(value = "fast", method = RequestMethod.POST)
    public TSIResultDTO fastTSI(@RequestBody FastTSIDTO tsiDTO) {
        return FastTSIService.calc(tsiDTO);
    }

    @RequestMapping(value = "sett-predict", method = RequestMethod.POST)
    public SettSeriesDTO settPredict(@RequestBody SettSeriesDTO settSeriesDTO) {
        return settTimeSeriesService.predict(settSeriesDTO);
    }

}

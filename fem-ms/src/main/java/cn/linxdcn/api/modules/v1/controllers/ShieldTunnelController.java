package cn.linxdcn.api.modules.v1.controllers;

import cn.linxdcn.api.modules.v1.DTO.LoadStructureInputDTO;
import cn.linxdcn.api.modules.v1.DTO.LoadStructureOutputDTO;
import cn.linxdcn.api.modules.v1.services.LoadStructureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/fem")
public class ShieldTunnelController {
    @Autowired
    LoadStructureService loadStructureService;

    @RequestMapping(value = "load-structure", method = RequestMethod.POST)
    public LoadStructureOutputDTO loadStructure(@RequestBody LoadStructureInputDTO inputDTO) {
        return loadStructureService.calc(inputDTO);
    }
}

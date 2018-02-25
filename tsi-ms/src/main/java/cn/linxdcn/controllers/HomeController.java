package cn.linxdcn.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by linxiaodong on 20/02/2018.
 */
@Controller
public class HomeController {
    @RequestMapping("")
    @ResponseBody
    public String home() {
        return "TSI-ms";
    }
}

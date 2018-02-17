package cn.linxdcn.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

/**
 * Created by linxiaodong on 17/02/2018.
 */
@Controller
@ApiIgnore
public class HomeController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/home")
    public String home() {
        return "index";
    }

    @RequestMapping("/doc")
    public String doc() {
        return "api";
    }
}

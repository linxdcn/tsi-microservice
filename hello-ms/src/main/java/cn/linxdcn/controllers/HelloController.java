package cn.linxdcn.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * cn.linxdcn.controllers.HelloController
 *
 * @author dansan.lxd@alibaba-inc.com
 * @date 12/02/2018 4:27 PM
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("")
    public String home(@RequestParam String name) {
        return "Hello, " + name;
    }
}

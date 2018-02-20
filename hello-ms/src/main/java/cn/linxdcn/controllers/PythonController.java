package cn.linxdcn.controllers;

import cn.linxdcn.models.Py;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by linxiaodong on 18/02/2018.
 */
@Controller
@RequestMapping("py")
public class PythonController {
    @Autowired
    Py py;

    @RequestMapping("test")
    @ResponseBody
    public String test() {
        return py.run("test.py");
    }
}

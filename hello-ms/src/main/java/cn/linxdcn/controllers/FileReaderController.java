package cn.linxdcn.controllers;

import cn.linxdcn.models.FileReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by linxiaodong on 18/02/2018.
 */
@RequestMapping("file")
@Controller
public class FileReaderController {
    @Autowired
    FileReader fileReader;

    @RequestMapping("read")
    @ResponseBody
    public String read() {
        return fileReader.read();
    }
}

package com.example.springbootdocker;

import org.springframework.stereotype.Controller;
import
        org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class SpringframeworkController {
    @RequestMapping("/index")
    public String getIndex() {
        return "index";
    }

    @RequestMapping("/forward")
    public String forward() {
        return "index";
    }
    @RequestMapping("/backward")
    public String backward() {
        return "index";
    }
    @RequestMapping("/left")
    public String left() {
        return "index";
    }
    @RequestMapping("/right")
    public String right() {
        return "index";
    }


}

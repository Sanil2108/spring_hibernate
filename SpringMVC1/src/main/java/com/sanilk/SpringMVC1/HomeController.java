package com.sanilk.SpringMVC1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String showMyPage(){
        return "main-menu";
    }

}

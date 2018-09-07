package com.sanilk.SpringMVC2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home {

    @RequestMapping("/")
    public String getHome(){
        return "home";
    }

}

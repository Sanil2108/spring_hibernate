package com.sanilk.SpringMVC2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ClassWorldController {

    @RequestMapping("/classForm")
    public String classForm(){
        return "class_form";
    }

    @RequestMapping("/classFormShow")
    public String getClassForm(@RequestParam("name") String name, Model m){
        m.addAttribute("message", name);
        return "classFormShow";
    }

}

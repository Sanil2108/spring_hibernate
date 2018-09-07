package com.sanilk.SpringMVC2;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;

@Controller
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm(){
        return "form_show";
    }

    @RequestMapping("/processForm")
    public String processForm(){
        return "form_process";
    }

    @RequestMapping("/updatedForm")
    public String processForm2(HttpServletRequest request, Model model){
        String text = request.getParameter("studentName");
        text = text.toUpperCase();
        model.addAttribute("message", text);

        return "form_updated";
    }

    @RequestMapping("/JSONform")
    public String processJSONForm(HttpServletRequest request, HttpServletResponse response){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", request.getParameter("name"));
        jsonObject.put("marks", 12);

        try {
            OutputStream out = response.getOutputStream();
            out.write(jsonObject.toString().getBytes());
        }catch (Exception e){
            e.printStackTrace();
        }


        return "form_updated";
    }

}

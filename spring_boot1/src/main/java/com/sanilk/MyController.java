package com.sanilk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MyController {

    @Autowired
    ContactDAO contactDAO;

    @RequestMapping(name = "/home")
    public String doSomething(){
        return "Hello";
    }

    @RequestMapping(name = "/takeJSON", method = RequestMethod.POST)
    public String getJSON(@RequestBody Contact c){
        contactDAO.saveContact(c);

        return "Got JSON!";
    }

}

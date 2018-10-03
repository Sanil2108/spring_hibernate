package com.sanilk.phonebook;

import com.sanilk.phonebook.dao.ContactDAO;
import com.sanilk.phonebook.entities.Contact;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("/phonebook")
public class MyController {

    @Autowired
    ContactDAO contactDAO;

    @Autowired
    SessionFactory sessionFactory;

    @RequestMapping("/")
    public String getHome(Model contactsModel){
        ArrayList<Contact> contacts= contactDAO.getAllContacts();
        contactsModel.addAttribute("contacts", contacts);
        return "home";
    }

    @RequestMapping("/create")
    public String createContact(){
        Contact c = new Contact("Sanil khurana", "gmail@sanilkhurana.co.in", "8860009569");
        contactDAO.storeContact(c);
        return "home";
    }

}

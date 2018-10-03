package com.sanilk.project.controller;

import com.sanilk.project.dao.CustomerDAO;
import com.sanilk.project.entity.Customer;
import com.sanilk.project.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/list")
    public String listCustomer(Model model){
        List<Customer> customers = customerService.getCusstomers();
        model.addAttribute("customers", customers);
        return "list-customers";
    }

    @GetMapping("/new")
    public String createCustomer(Model model){
        model.addAttribute("customer", new Customer());

        return "save-customer";
    }

    @PostMapping("/save")
    public String saveCustomer(@ModelAttribute("customer") Customer customer){
        customerService.saveCustomer(customer);

        return "redirect:/customer/list";
    }

//    @RequestMapping("/showFormForUpdate")
//    public String updateCustomer(@RequestParam("customerId") int id, Model theModel){
//        Customer c = customerService.getCustomer();
//        theModel.addAttribute("customer", c);
//        return "customer-form";
//    }

}

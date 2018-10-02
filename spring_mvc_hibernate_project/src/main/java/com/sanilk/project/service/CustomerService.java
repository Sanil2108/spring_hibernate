package com.sanilk.project.service;

import com.sanilk.project.entity.Customer;

import java.util.List;

public interface CustomerService {
    public List<Customer> getCusstomers();
    void saveCustomer(Customer c);
}

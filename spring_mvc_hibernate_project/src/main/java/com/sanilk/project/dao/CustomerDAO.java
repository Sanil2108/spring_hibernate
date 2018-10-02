package com.sanilk.project.dao;

import com.sanilk.project.entity.Customer;

import java.util.List;

public interface CustomerDAO {
    List<Customer> getCustomers();
    Customer getCustomer(int i);
    void saveCustomer(Customer c);
    void deleteCustomer(int i);
}

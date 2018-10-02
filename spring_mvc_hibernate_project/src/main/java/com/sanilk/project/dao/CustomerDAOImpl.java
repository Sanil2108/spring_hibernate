package com.sanilk.project.dao;

import com.sanilk.project.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Customer> getCustomers() {
        Session session = sessionFactory.getCurrentSession();
        List<Customer> customers = session.createQuery("from Customer order by lastName", Customer.class).getResultList();
        return customers;
    }

    @Override
    public Customer getCustomer(int i) {
        Session s = sessionFactory.getCurrentSession();
        Customer c = s.get(Customer.class, i);
        return c;
    }

    @Override
    public void saveCustomer(Customer c) {
        Session session = sessionFactory.getCurrentSession();
        session.save(c);
    }

    @Override
    public void deleteCustomer(int i) {
        Session s = sessionFactory.getCurrentSession();
        s.createQuery("delete from Customer  where id = "+i).executeUpdate();
    }

    @Override
    public void updateCustomer(@RequestParam("customerId") int customerId, Model theModel){
        Session s = sessionFactory.getCurrentSession();

    }
}

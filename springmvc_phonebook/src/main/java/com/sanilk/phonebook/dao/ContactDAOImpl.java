package com.sanilk.phonebook.dao;

import com.sanilk.phonebook.entities.Contact;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

public class ContactDAOImpl implements ContactDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    @Transactional
    public Contact getContact(int id) {
        Contact c = sessionFactory.getCurrentSession().get(Contact.class, id);
        return c;
    }

    @Override
    @Transactional
    public void storeContact(Contact c) {
        sessionFactory.getCurrentSession().save(c);
    }

    @Transactional
    @Override
    public ArrayList<Contact> getAllContacts() {
        ArrayList<Contact> contacts = (ArrayList<Contact>) sessionFactory.getCurrentSession().createQuery("from Contact", Contact.class).getResultList();
        return contacts;
    }

    @Override
    public void updateContact(Contact c) {

    }
}

package com.sanilk;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;

public class ContactDAOImpl implements ContactDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    @Override
    public void saveContact(Contact c) {
        Session session = sessionFactory.getCurrentSession();
        session.save(c);
    }
}

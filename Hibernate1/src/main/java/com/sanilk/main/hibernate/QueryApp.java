package com.sanilk.main.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;

import java.util.List;


public class QueryApp {
    public static void main(String[] args){
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);

        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties())
                .build();
        SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        List<Student> students =
                session.createQuery("from Student where email like '%@gmail.com'").getResultList();
//                session.createQuery("from com.sanilk.main.hibernate.Student where firstName='Hello'").getResultList();

        for(Student s:students){
            System.out.println(s);
        }
        session.getTransaction().commit();

        session.close();
    }
}

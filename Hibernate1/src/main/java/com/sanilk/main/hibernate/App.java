package com.sanilk.main.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class App {

    public static void main(String[] args) throws Exception{
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        System.out.println("Hibernate Configuration loaded");

        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        System.out.println("Hibernate serviceRegistry created");

        SessionFactory sessionFactory = configuration
                .addAnnotatedClass(Student.class)
                .buildSessionFactory(serviceRegistry);

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Student s = new Student("Hello",  "world", "sanilkhurana7@gmail.com");

        session.save(s);
        session.getTransaction().commit();


//        Student s = session.get(Student.class, 2);
//        System.out.println(s);
//
//        session.getTransaction().commit();

        session.close();
        sessionFactory.close();


        System.out.println(s);
    }

}

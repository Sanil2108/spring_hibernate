package com.sanilk.main.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.util.List;

public class UpdateApp {

    public static void main(String[] args){
        Configuration configuration = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class);

        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties())
                .build();

        SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);

        Session session = sessionFactory.openSession();

        session.beginTransaction();

        Student student = ((List<Student>)session.createQuery("from Student where id=103").getResultList()).get(0);
        System.out.println(student);
        student.firstName = "Sanil2";

        session.getTransaction().commit();

        session = sessionFactory.openSession();
        session.beginTransaction();

        session.createQuery("update Student set email='abcd'").executeUpdate();

        session.getTransaction().commit();

        sessionFactory.close();
    }

}

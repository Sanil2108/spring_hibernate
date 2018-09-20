package com.sanilk.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Main {

    public static void main(String[] args){
        Configuration configuration = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(InstructorDetail.class);

        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties())
                .build();

        SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);

        Session session = sessionFactory.openSession();
        session.beginTransaction();

//        Instructor instructor = new Instructor("sanil2", "khurana", "sanilkhurana7@gmail.com");
//        InstructorDetail instructorDetail = new InstructorDetail
//                ("none2", "kuch hai");
//        instructor.setInstructorDetail(instructorDetail);
//
//        session.save(instructor);


//        Instructor instructor = session.get(Instructor.class, 1);
//        System.out.println(instructor);
//
//        InstructorDetail instructorDetail = instructor.getInstructorDetail();
//        System.out.println(instructorDetail);

        InstructorDetail instructorDetail = session.get(InstructorDetail.class, 2);
//        Instructor instructor = instructorDetail.getInstructor();

        System.out.println(instructorDetail);
//        System.out.println(instructor);

//        instructorDetail.getInstructor().setInstructorDetail(null);

        session.delete(instructorDetail);


        session.getTransaction().commit();
        sessionFactory.close();
    }

}

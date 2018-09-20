package com.sanilk.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Main2 {

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

        Instructor instructor = new Instructor();
        instructor.setEmail("sanilkhurana7@gmail.com");
        instructor.setFirstName("Sanil");
        instructor.setLastName("Khurana");

        Course c = new Course();
        c.setName("Course 1");
        instructor.addCourse(c);
        c.setInstructor(instructor);

        InstructorDetail instructorDetail = new InstructorDetail();
        instructorDetail.setHobby("hobby");
        instructorDetail.setYoutubeChannel("yt channel");
        instructor.setInstructorDetail(instructorDetail);
        instructorDetail.setInstructor(instructor);

//        session.save(instructor);
        session.persist(instructor);
//        session.save(c);  

        session.getTransaction().commit();
        sessionFactory.close();
    }

}

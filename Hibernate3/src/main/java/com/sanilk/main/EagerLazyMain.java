package com.sanilk.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.util.List;

public class EagerLazyMain {

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

        Instructor instructor = session.get(Instructor.class, 1);
//        Course c = new Course();
//        c.setName("abcd");
//        c.setInstructor(instructor);
//        instructor.addCourse(c);
//        session.persist(c);

        session.getTransaction().commit();
        session.close();

        List<Course> courses = instructor.getCourses();
        System.out.println(courses);

        sessionFactory.close();
    }

}

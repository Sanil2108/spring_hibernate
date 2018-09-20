package com.sanilk.main;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class Main4 {
    public static void main(String[] args){
        Configuration configuration = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(Review.class);
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties())
                .build();
        SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);


        Session session = sessionFactory.openSession();
        session.beginTransaction();

//        Instructor instructor = new Instructor("Sanil", "Khuranan", "sanilkhurana7@gmail.com");
//        Course c = new Course("My course", instructor);
//
//        Student s = new Student("sani", "sfa", "gfsgfs");
//        Student s2 = new Student("sadasni", "sdafa", "gfsgfs");
//        Student s3 = new Student("sdasadasni", "sdafa", "gfsgfs");
//
//        c.addStudent(s);
//        c.addStudent(s2);
//        c.addStudent(s3);
//
//        session.persist(c);

        Student s = session.get(Student.class, 1);
        System.out.println(s.getCourses());



        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}

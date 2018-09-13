package com.sanilk.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.util.List;

public class Program {

    public static void createEmployee(SessionFactory sessionFactory, Employee e){
        Session s = sessionFactory.openSession();
        s.beginTransaction();

        s.save(e);

        s.getTransaction().commit();
    }

    public static Employee getEmployee(SessionFactory sessionFactory, int id){
        Session s = sessionFactory.openSession();
        s.beginTransaction();

        Employee e= s.get(Employee.class, id);

        s.getTransaction().commit();
        return e;
    }

    public static List<Employee> getEmployees(SessionFactory sessionFactory, String company){
        Session s = sessionFactory.openSession();
        s.beginTransaction();

        List<Employee> employees = s.createQuery("from Employee where company = 'moh maya'").getResultList();

        s.getTransaction().commit();

        return employees;
    }

    public static void deleteEmployee(SessionFactory sessionFactory, int id){
        Employee e = getEmployee(sessionFactory, id);

        Session s = sessionFactory.openSession();
        s.beginTransaction();

        s.delete(e);

        s.getTransaction().commit();
    }

    public static void main(String[] args){
        Configuration configuration = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class);
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties())
                .build();
        SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);

//        Employee e = new Employee("Sanil2", "Khurana", "moh maya");
//        createEmployee(sessionFactory, e);

//        for(Employee e : getEmployees(sessionFactory, "moh maya")){
//            System.out.println(e);
//        }

        deleteEmployee(sessionFactory, 1);

        sessionFactory.close();
    }
}

package com.sanilk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config_scopes.xml");

        Coach coach = context.getBean("myCoach", Coach.class);
        Coach otherCoach = context.getBean("myCoach", Coach.class);

        System.out.println(coach == otherCoach);
        System.out.println("Memory location for coach \t"+coach);
        System.out.println("Memory location for otherCoach \t"+otherCoach);

        context.close();
    }

}

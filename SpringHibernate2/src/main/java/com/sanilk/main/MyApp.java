package com.sanilk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config_scopes.xml");

        Coach coach = context.getBean("myCoach", Coach.class);
        System.out.println(coach.getFortune());

        context.close();
    }
}

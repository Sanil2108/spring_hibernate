package com.sanilk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        Coach coach = context.getBean("footballCoach", Coach.class);
        System.out.println(coach.getPractice());

        Coach coach1 = context.getBean("footballCoach", Coach.class);
        System.out.println(coach1.getPractice());

        context.close();
    }
}

package com.sanilk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        Coach coach = context.getBean("scopeTestingCoach", Coach.class);

        System.out.println(coach.getDailyWorkout());

        context.close();
    }
}

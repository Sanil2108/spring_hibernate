package com.sanilk.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        Coach c = context.getBean("myCoach", Coach.class);

        System.out.println(c.getDailyWorkout());
        System.out.println(c.getDailyFortune());


        context.close();
    }
}

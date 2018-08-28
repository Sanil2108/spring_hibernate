package com.sanilk.main;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Scope("singleton")
@Component
public class FootballCoach implements Coach {
    int practice = 0;

    public int getPractice(){
        practice++;
        return practice;
    }

    public String getDailyWorkout() {
        return "Practice dribbling";
    }

    @PostConstruct
    public void init(){
        System.out.println("Inited");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Destroyed");
    }
}

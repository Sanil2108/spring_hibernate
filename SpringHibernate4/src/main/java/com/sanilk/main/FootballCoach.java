package com.sanilk.main;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
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
}

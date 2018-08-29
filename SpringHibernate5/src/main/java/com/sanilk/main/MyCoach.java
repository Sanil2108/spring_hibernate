package com.sanilk.main;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyCoach implements Coach{
    FortuneService fortuneService;

    @Value("${foo.email}")
    String email;

    @Value("${foo.team}")
    String teamName;

    public MyCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Exercise from "+email+" for "+teamName;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }
}

package com.sanilk.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myCoach")
public class FootballCoach implements Coach {

    @Value("${coach.email}")
    public String email;

    //Field injection
//    @Qualifier("randomFortuneService")
//    @Autowired
    FortuneService fortuneService;

    //Constructor injection
    @Autowired
    public FootballCoach(@Qualifier("fileFortune") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    //Setter injection
//    @Autowired
//    public void setFortuneService(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice your finishing"+fortuneService.getFortune()+" "+email;
    }
}

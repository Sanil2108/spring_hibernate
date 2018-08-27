package com.sanilk.main;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class ScopeTestingCoach implements Coach {


    @Override
    public String getDailyWorkout() {
        return "Something 4";
    }
}

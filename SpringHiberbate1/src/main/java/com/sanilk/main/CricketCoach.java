package com.sanilk.main;

public class CricketCoach implements Coach{
    private FortuneService fortuneService;

    public CricketCoach() {
        System.out.println("Cricket coach created");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Setting some stuff");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Hit balls with bats";
    }

    @Override
    public String getFortune() {
        return "From your cricket coach - "+fortuneService.getFortune();
    }
}

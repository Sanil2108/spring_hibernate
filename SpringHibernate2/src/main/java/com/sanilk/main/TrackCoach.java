package com.sanilk.main;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;

    public void init(){
        System.out.println("Initializing");
    }

    private TrackCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Run or something like that";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
}

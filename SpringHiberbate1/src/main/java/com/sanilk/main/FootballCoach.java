package com.sanilk.main;

public class FootballCoach implements Coach {
    public int temp = 1;

    private FortuneService fortuneService;
    private FootballCoachAdvice footballCoachAdvice;

    FootballCoach(FortuneService fortuneService){
//        this.footballCoachAdvice = footballCoachAdvice;
        this.fortuneService = fortuneService;
    }

    public void setFootballCoachAdvice(FootballCoachAdvice footballCoachAdvice) {
        this.footballCoachAdvice = footballCoachAdvice;
    }

    @Override
    public String getDailyWorkout() {
        System.out.println(fortuneService.getFortune());
        System.out.println(footballCoachAdvice.advise());
        return "Score something";
    }

    @Override
    public String getFortune() {
        return null;
    }
}

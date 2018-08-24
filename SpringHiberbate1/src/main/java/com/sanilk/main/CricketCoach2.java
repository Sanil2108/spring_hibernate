package com.sanilk.main;

public class CricketCoach2 implements Coach{
    FortuneService fortuneService;

    private String email;
    private String team;

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String getDailyWorkout() {
        return "Lappe maar "+email+" "+team+" ke liye.";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
}

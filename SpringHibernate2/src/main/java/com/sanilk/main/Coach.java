package com.sanilk.main;

public interface Coach extends FortuneService {
    String getDailyWorkout();
    void init();
    void destroy();
}

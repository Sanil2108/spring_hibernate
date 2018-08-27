package com.sanilk.main;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {
    Random random;
    String[] arr = {
            "Fortune1", "Fortune2", "Fortune3"
    };

    public RandomFortuneService(){
        random = new Random();
    }

    @Override
    public String getFortune() {
        return arr[random.nextInt(arr.length)];
    }
}

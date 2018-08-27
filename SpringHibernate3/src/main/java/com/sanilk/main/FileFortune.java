package com.sanilk.main;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class FileFortune implements FortuneService{
    String[] fortunes;
    Random random;

    @Value("${f1}")
    String f1;

    @Value("${f2}")
    String f2;

    @Value("${f3}")
    String f3;

    public FileFortune(){
        random = new Random();

        fortunes = new String[]{f1, f2, f3};
    }

    @Override
    public String getFortune() {
        fortunes = new String[]{f1, f2, f3};
        return "\n"+fortunes[random.nextInt(fortunes.length)]+"\n";
    }
}

package com.sanilk.main;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@PropertySource("sport.properties")
@Configuration
//@ComponentScan("com.sanilk.main")
public class SportConfig {
    
    @Bean
    public static PropertySourcesPlaceholderConfigurer
    propertySourcesPlaceHolderConfigurer() {

        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public FortuneService happyFortuneService(){
        return new HappyFortuneService();
    }

    @Bean
    public MyCoach myCoach(){

        return new MyCoach(happyFortuneService());
    }

}

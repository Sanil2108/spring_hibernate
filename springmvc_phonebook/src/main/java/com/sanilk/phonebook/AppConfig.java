package com.sanilk.phonebook;

import com.sanilk.phonebook.dao.ContactDAO;
import com.sanilk.phonebook.dao.ContactDAOImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration
public class AppConfig {

    @Bean
    public ContactDAO getContactDAO(){
        return new ContactDAOImpl();
    }

//    @Bean
//    public ViewResolver getViewResolver(){
//        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
//        internalResourceViewResolver.setPrefix("/WEB-INF/views/");
//        internalResourceViewResolver.setSuffix(".jsp");
//        return internalResourceViewResolver;
//    }

}

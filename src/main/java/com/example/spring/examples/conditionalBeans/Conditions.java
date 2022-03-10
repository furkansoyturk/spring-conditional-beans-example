package com.example.spring.examples.conditionalBeans;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Conditions {

    @Bean
    @ConditionalOnProperty(name="welcomeMessage.enabled", havingValue="true")
    public WelcomeMessage welcomeMessage(){
        return new WelcomeMessage("Welcome");
    }

    @Bean
    @ConditionalOnMissingBean(WelcomeMessage.class)
    public GenericMessage genericMessage(){
        return new GenericMessage("Hey, Amigo");
    }


}

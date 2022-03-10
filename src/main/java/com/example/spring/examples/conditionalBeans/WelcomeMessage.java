package com.example.spring.examples.conditionalBeans;


public class WelcomeMessage implements Message{

    private String message;

    public WelcomeMessage(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

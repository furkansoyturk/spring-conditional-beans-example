package com.example.spring.examples.conditionalBeans;

public class GenericMessage implements Message{

    private String message;


    public GenericMessage(String message){
        this.message = message;
    }


    @Override
    public String getMessage() {
        return message;
    }
}

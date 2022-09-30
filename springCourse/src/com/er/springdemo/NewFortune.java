package com.er.springdemo;

public class NewFortune implements FortuneService{
    @Override
    public String getFortune() {
        return "Wow new fortune service implemented!";
    }
    
}

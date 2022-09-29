package com.er.springdemo;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseballCoach implements Coach{

    //define a privacy field for the dependency
    private FortuneService fortuneService;

    public BaseballCoach() {
    }

    //define the constructor for dependency injection
    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        //use my fortuneService to get a fortune
        return fortuneService.getFortune();
    }


}

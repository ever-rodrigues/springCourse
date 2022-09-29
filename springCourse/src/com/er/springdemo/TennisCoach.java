package com.er.springdemo;

import org.springframework.beans.factory.annotation.Autowired;

public class TennisCoach implements Coach{

    @Autowired
    FortuneService fortuneService;

    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService=fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Do 3 hours of tennis training!";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}

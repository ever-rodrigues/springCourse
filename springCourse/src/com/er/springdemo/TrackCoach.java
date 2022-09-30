package com.er.springdemo;

import org.springframework.beans.factory.DisposableBean;

public class TrackCoach implements Coach, DisposableBean {
    public TrackCoach(HappyFortuneService happyFortuneService) {
    }

    public TrackCoach() {
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5K";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it";
    }

    //add an init method


    public void doMyStartStuff(){
        System.out.println("Track Coach : inside method doMyStartStuff");
    }
    //add destroy  method
    public void destroyMyStartStuff(){
        System.out.println("Track Coach : inside method destroyMyStartStuff");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("TrackCoach : inside methd desrtroy implemented by DisposableBean");
    }
}

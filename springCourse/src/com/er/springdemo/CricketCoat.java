package com.er.springdemo;

public class CricketCoat implements Coach {


    private String emailAddress;
    private String team;


    private FortuneService fortuneService;


    //No args Constructor
    public CricketCoat() {
        System.out.println("CricketCoat: No Args Constructor");
    }

    //our setter method
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoat: Inside Setter Method");
        this.fortuneService = fortuneService;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoat: Inside SetterEmail Method");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoat: Inside SetterTeam Method");
        this.team = team;
    }


    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast only for 15 minutes.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}

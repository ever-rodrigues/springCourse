package com.er.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        //Configuration using XML
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach theCoach= context.getBean("myCoach",Coach.class);



        //create the object
        Coach coach= new BaseballCoach();
        Coach newcoach= new TrackCoach();

        //use the object
        System.out.println(coach.getDailyWorkout());
        System.out.println(newcoach.getDailyWorkout());


    }
}
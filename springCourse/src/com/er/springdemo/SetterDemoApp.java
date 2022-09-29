package com.er.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {
        //load Spring configuration file

        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring cotainer

        CricketCoat cricketCoat= context.getBean("myCrickedCoach", CricketCoat.class);
        //call methods on the bean

        System.out.println("After the context create a Bean, and set from applicationContext file all properties he starts to .... Print :");
        System.out.println(cricketCoat.getDailyFortune());
        System.out.println(cricketCoat.getDailyWorkout());

        System.out.println(cricketCoat.getEmailAddress());
        System.out.println(cricketCoat.getTeam());

    }
}

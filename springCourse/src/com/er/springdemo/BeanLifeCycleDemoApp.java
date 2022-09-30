package com.er.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
    public static void main(String[] args) {


        //load Spring confifuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifesycle-applicationContext.xml");

        //retrieve bean from spring container

        Coach trackCoach = context.getBean("myCoach", Coach.class);
        System.out.println(trackCoach.getDailyWorkout());
        context.close();
    }


}

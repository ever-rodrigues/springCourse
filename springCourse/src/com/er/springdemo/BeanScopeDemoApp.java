package com.er.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {


        //load Spring confifuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        //retrieve bean from spring container

        Coach baseballCoach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);


        //check if they are the same
        boolean result= (baseballCoach == alphaCoach);

        //print result of check
        System.out.println(result);
        System.out.println(baseballCoach);
        System.out.println(alphaCoach);
        context.close();
    }


}

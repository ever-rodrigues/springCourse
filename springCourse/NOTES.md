Here I will be some notes about this learning project.

->Spring Bean is a simple Java Object!
    When Java objects are created by The Spring Container, then Spring refers to them as
"Spring Beans".
    Spring Beans are created from normal Java Classes ....just like Java Objects!

        JavaClass -> Beans
        JavaClass -> JavaObject

So whenever you see "Spring Beans " just think Java Object!


Inversion of Control:
-> 

Spring Container:
-> Primary functions:
    ->Create and manage objects ( Inversion of Control)
    ->Inject Objects dependencies ( Dependency Injection)



Configuration of Spring Container:
    ->XML configuration file (legacy)
    ->Java Annotation(modern)
    ->Java Source Code (modern)

->First App using Spring 
    ->First create the applicationContext.xml file that will incluse your bean and all
XML requeriment of Spring 
        -> Here will be create your Bean with all details to your Main class access via ClassPathXMLApplicationContext
    <bean id="myCoach" class="com.er.springdemo.BaseballCoach">
    </bean>

After that go to Main File and setup your Application Context file...

Now you need to retreieve data from Spring Container:

    //retrieve bean from Spring Container
    Coach theCoach= context.getBean("myCoach",Coach.class);

Now just call methods from your Bean
    //call methods on the bean
    System.out.println(theCoach.getDailyWorkout());

Now close your context using
    context.close();


Spring takeout the Logger from Run panel , but if you whant to see just create a class
with all Logger packages and also injet a bean at applicationContext.xml fine, and run.
At this example you can see all details about this "MyLoggerConfig" class...


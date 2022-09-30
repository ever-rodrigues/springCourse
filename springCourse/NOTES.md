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
with all Logger packages and also inject a bean at applicationContext.xml fine, and run.
At this example you can see all details about this "MyLoggerConfig" class...


->No Args Constructor at Spring:
    -> When you dont define any contructor in your class, compiler defines default one for you, however when 
you declare any constructor compliler doesn`t do it for you. 
    ->Since you have defined a constructor at your class, compiler didn`t create a default one.



->Setter Injection
    -> Capitalize first letter of property name:
        ->setBestAthlete


Just to Improve this project we will use the proprieties file , 
instead of using all values hardcode inside applicationContext.xml file.

Now we can add all values inside sport.proprieties and applicatonContext 
can get this files from proprieties file.




->Bean (Lifesycle of a Bean)
    ->Singleton?
        ->Spring creates only one instance of the Beay
            Ex: contect.getBean("myCoach, Coach.class);
        Only one Bean and share to everyone( Only one part of memori will be used)

->Prototype ( Creates a beans instance for each container request. 
(Prototype scope is goog to get tracking stateful data) 
    <bean id="myCoach" 
        class ="com.er.springdemo.TrackCoach"
        scope="prototype">
    </bean>

Sojust to be clear, when you create a bean with scope="prototype" all the beans will be in distinct memory
location, this means you will be Beans diferens at each instance of it...
    ->SO NEW OBJECT FOR EACH REFERENCE!


Bean Lifesycle 

    Container started-> Bean Insntancied ->Dependencies injected -> 
    -> Internal Spring Procesing -> Your Custom Init Methods

    About init-mehtod and destroy-method
        -> The Return type ->Void is the most commonly used.
        -> The method can have any method-name
        ->The methods can not accept arguments .  The method should be no-args.




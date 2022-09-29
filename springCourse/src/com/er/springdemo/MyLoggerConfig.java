package com.er.springdemo;

//package to see al the steps of the Logging at Run painel
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class MyLoggerConfig {
    private String rootLoggerLevel;
    private String printedLogger;

    public void setRootLoggerLevel(String rootLoggerLevel) {
        this.rootLoggerLevel = rootLoggerLevel;
    }

        public void setPrintedLogger(String printedLogger) {
        this.printedLogger = printedLogger;
    }


    public void initLogger(){
        //parse Levels
        Level rootLevel= Level.parse(rootLoggerLevel);
        Level printLevel= Level.parse(printedLogger);

        //get Logger for app context
        Logger applicationContextLogger= Logger.getLogger(AnnotationConfigApplicationContext.class.getName());

        //get parent Logger
        Logger loggerParent = applicationContextLogger.getParent();

        //set root logging level
        loggerParent.setLevel(rootLevel);

        //setup console handler
        ConsoleHandler consoleHandler= new ConsoleHandler();

        consoleHandler.setLevel(printLevel);
        consoleHandler.setFormatter(new SimpleFormatter());

        //add handler to the logger
        loggerParent.addHandler(consoleHandler);
    }
}

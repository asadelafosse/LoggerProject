package com.ivik.logger;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Sebastien on 3-2-2016.
 */
class FancyLogging implements Logger{

    public void debug(String msg){
        DateFormat df = new SimpleDateFormat("yyyy.MM.dd G)'at' HH:mm:ss z");
        Date d = new Date();
        System.out.println(df.format(d) + " *** DEBUG *** " + msg);
    }

    public void warn (String msg){
        DateFormat df = new SimpleDateFormat("yyyy.MM.dd G)'at' HH:mm:ss z");
        Date d = new Date();
        System.out.println(df.format(d) + " *** WARN *** " + msg);
    }

    public void info (String msg){
        DateFormat df = new SimpleDateFormat("yyyy.MM.dd G)'at' HH:mm:ss z");
        Date d = new Date();
        System.out.println(df.format(d) + " *** INFO *** " + msg);
    }

    public void error (String msg){
        DateFormat df = new SimpleDateFormat("yyyy.MM.dd G)'at' HH:mm:ss z");
        Date d = new Date();
        System.out.println(df.format(d) + " *** ERROR *** " + msg);
    }
}

package com.ivik.logger;

/**
 * Created by Sebastien on 3-2-2016.
 */
class SimpleLogging implements Logger {

    public void debug(String msg){
        System.out.println("DEBUG: " + msg);
    }

    public void warn (String msg){
        System.out.println("WARN: " + msg);
    }

    public void info (String msg){
        System.out.println("INFO: " + msg);
    }

    public void error (String msg){
        System.out.println("ERROR: " + msg);
    }
}

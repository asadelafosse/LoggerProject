package com.ivik.app;

import com.ivik.logger.LogFactory;
import com.ivik.logger.LogType;

/**
 * Created by Sebastien on 3-2-2016.
 */
public class TestLogger {

    public static void main(String[] args) {

        LogFactory.setLogger(LogType.FANCY);
        // The main advantage of this structure is that by changing this single parameter in the main method, a different
        // logging method will be used, without having to change any of the rest of the code in any other class.

        MyUtils.getInt("999");
        MyUtils.getInt("Oops");
        MyUtils.getInt("42");

    }
}

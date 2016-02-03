package com.ivik.app;

import com.ivik.logger.LogFactory;
import com.ivik.logger.Logger;

/**
 * Created by Sebastien on 3-2-2016.
 */
public class MyUtils {

    static Logger logger = LogFactory.getLogger();

    public static boolean getInt(String intString){
        boolean ok = false;
        logger.info("Now checking string " + intString + "...");
        try{
            int value = Integer.parseInt(intString);
            ok = true;
            if(value == 42){logger.debug("It's the answer to life, the universe and everything.");
            } else logger.debug("Don't worry!");
        } catch (NumberFormatException e){
            logger.error(e.getMessage());
        }
        return ok;
    }
}

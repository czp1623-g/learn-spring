package org.czp.common.log;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log {
    private static final Logger logger = LoggerFactory.getLogger(Log.class);
    private static Logger l() {

        return logger;
    }
    public static void i(String s) {
        l().info(s);
    }
}

package net.rainmore.demo.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Demo1 {

    static Logger logger = LoggerFactory.getLogger(Demo1.class);

    public static void main (String args[]) {
        logger.trace("Hello World");
        logger.debug("Hello World");
        logger.info("Hello World");
        logger.warn("Hello World");
        logger.error("Hello World");

    }

    public void runLog() {
        logger.trace("Hello World");
        logger.debug("Hello World");
        logger.info("Hello World");
        logger.warn("Hello World");
        logger.error("Hello World");
    }
}

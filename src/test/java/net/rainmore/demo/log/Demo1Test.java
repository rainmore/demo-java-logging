package net.rainmore.demo.log;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Demo1Test {
    static Logger logger = LoggerFactory.getLogger(Demo1Test.class);

    @Test
    public void testConfig() {
        // this should use log4j2-test.xml and show only error

        logger.trace("Hello World");
        logger.debug("Hello World");
        logger.info("Hello World");
        logger.warn("Hello World");
        logger.error("Hello World");

    }

    @Test
    public void testConfigForClass() {

        Demo1 d1 = new Demo1();
        // this should show only error log
        d1.runLog();
    }

}

package com.ats.simpletest2;

import javax.swing.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleTest2 {

    private static final Logger logger = LogManager.getLogger(SimpleTest2.class);

    public static void main(String[] args) {
        logger.debug("Hello from Log4j 2 - DEBUG");
        logger.error("Hello form Log4J 2 - ERROR Log");
        System.out.println("Simple Test FULL");
        JOptionPane.showMessageDialog(null, "Hello");
    }

    public static String echo(String input ) {
        logger.debug("Echo from Log4j 2");
        return input;
    }

}

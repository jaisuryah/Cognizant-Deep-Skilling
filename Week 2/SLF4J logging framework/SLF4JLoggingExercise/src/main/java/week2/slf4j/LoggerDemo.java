package week2.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerDemo {
    private static final Logger logger = LoggerFactory.getLogger(LoggerDemo.class);

    public static void main(String[] args) {
        logger.info("This is an INFO message");
        logger.warn("This is a WARNING message");
        logger.error("This is an ERROR message");

        try {
            
            throw new RuntimeException("This is a simulated exception for logging demo");
        } catch (Exception e) {
            logger.error("An exception occurred: {}", e.getMessage());
        }
    }
}

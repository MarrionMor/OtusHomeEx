import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogTest {
    private static final Logger logger = LogManager.getLogger(LogTest.class);

    public static void main (String[] arg){
        logger.info("JAVA_HOME: {}" , System.getProperty("java_home"));
        logger.info("OS: {}", System.getProperty("os_name"));
    }
}


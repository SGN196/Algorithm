package ThinkingInJava.test.day1_7;

import org.junit.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author SGN196
 * @date 2019/1/7 21:21
 */

public class LoggerTest {
    private static final Logger myLogger = Logger.getLogger("com.mycompany.myapp");




    @Test
    public void test01(){
        Logger.getGlobal().info("getGlobal Object()");

    }

    @Test
    public void test02(){
        myLogger.warning("logger.warning李枕");
        myLogger.fine("logger.fine");
        myLogger.log(Level.ALL, "All");
        myLogger.log(Level.SEVERE, "SEVERE");
        myLogger.log(Level.WARNING, "WARNING");
        myLogger.log(Level.INFO, "INFO");
        myLogger.log(Level.CONFIG, "CONFIG");
        myLogger.log(Level.FINE, "FINE");
        myLogger.log(Level.FINER, "FINER");
        myLogger.log(Level.FINEST, "FINEST");

    }

    public static void main(String[] args) {

    }
}

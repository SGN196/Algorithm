package ThinkingInJava.test.day1_7;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * @author SGN196
 * @date 2019/1/7 23:49
 */

public class LoggingExceptions2 {
    private static Logger logger = Logger.getLogger("loggingException222222222");
    static void logException(Exception e){
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

    public static void main(String[] args) {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            logException(e);
        }
    }
}

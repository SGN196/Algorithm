package ThinkingInJava.exceptions;


import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * @author SGN196
 * @date 2019/1/8 10:27
 */



class LoggingException1 extends Exception{
    private static Logger logger = Logger.getLogger("LoggingExceptino1");
    public LoggingException1(){
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
class LoggingException2 extends Exception{
    private static Logger logger = Logger.getLogger("LoggingException2");
    public LoggingException2(){
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

public class E06_LoggingExceptions {
    public static void main(String[] args) {
        try {
            throw new LoggingException1();
        } catch (LoggingException1 loggingException1) {
            loggingException1.printStackTrace();
        }
        try {
            throw new LoggingException2();
        } catch (LoggingException2 loggingException2) {
            loggingException2.printStackTrace();
        }


    }
}

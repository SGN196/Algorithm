package ThinkingInJava.test.day1_7;


import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * @author SGN196
 * @date 2019/1/7 22:00
 */



class LoggingException extends Exception{
    private static Logger logger = Logger.getLogger("LoggingException，假的");
    public LoggingException(){
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
public class LoggingExceptions {
    public static void main(String[] args) {
        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.err.println("Caught " + e);
        }
        try{
            throw new LoggingException();
        }catch (LoggingException e){
            e.printStackTrace(System.out);
        }
    }
}

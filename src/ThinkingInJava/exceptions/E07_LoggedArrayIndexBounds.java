package ThinkingInJava.exceptions;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * @author SGN196
 * @date 2019/1/8 10:37
 */

public class E07_LoggedArrayIndexBounds {
    private static Logger logger = Logger.getLogger("E07fuck");

    private static void logException(Exception e){
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

    public static void main(String[] args) {
        char[] array = new char[10];
        try {
            array[10] = 'x';
        } catch (Exception e) {
            logException(e);
        }


    }


}

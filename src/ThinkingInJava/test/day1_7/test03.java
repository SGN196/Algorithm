package ThinkingInJava.test.day1_7;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author SGN196
 * @date 2019/1/7 18:40
 */

public class test03 {

    @Test
    public void test01(){
        PrintStream out = null;
        try {
            out = new PrintStream("D:\\2.txt");
            for (int i = 0; i < 100; i++) {
                out.println(i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            out.close();
        }

    }

    @Test
    public void test02(){

        Logger.getGlobal().setLevel(Level.ALL);
        Logger.getGlobal().info("show me dick");

    }
    private static final Logger myLogger = Logger.getLogger("cock");
    public static void main(String[] args) {
        System.out.println(myLogger.getName());
    }
}

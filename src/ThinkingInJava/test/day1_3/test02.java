package ThinkingInJava.test.day1_3;

import org.junit.Test;

import java.util.Map;

/**
 * @author SGN196
 * @date 2019/1/5 12:10
 */

public class test02 {
    @Test
    public void test01(){
        for(Map.Entry entry : System.getenv().entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

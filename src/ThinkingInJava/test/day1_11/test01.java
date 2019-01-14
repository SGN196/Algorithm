package ThinkingInJava.test.day1_11;

import org.junit.Test;

/**
 * @author SGN196
 * @date 2019/1/12 22:30
 */

class A{
    static {
        System.out.println("aaaaaaaa");
    }
}
public class test01 {
    @Test
    public void test01(){
        Class clazz = null;
        try {
            clazz = Class.forName("ThinkingInJava.test.day1_11.A");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(clazz);
    }

    @Test
    public void test02(){
        System.out.println(A.class);
    }
}

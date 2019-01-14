package ThinkingInJava.test.day1_7;

import org.junit.Test;

/**
 * @author SGN196
 * @date 2019/1/8 14:33
 */

public class Concatenation {
    public static void main(String[] args) {
        String mango = "mango";
        String s = "abc" + mango + "def" + 47;
        System.out.println(s);
    }

    @Test
    public void test01(){
        String a = "";
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            a += "xx";
        }
        System.out.println(System.currentTimeMillis() - start);
    }

    @Test
    public void test02(){
        StringBuffer a = new StringBuffer();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            a.append("xx");
        }
        System.out.println(System.currentTimeMillis() - start);
    }

    @Test
    public void test03(){
        StringBuilder sb = new StringBuilder(20000000);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            sb.append("xx");
        }
        System.out.println(System.currentTimeMillis() - start);
    }

}

package ThinkingInJava.test.day1_8;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SGN196
 * @date 2019/1/8 16:12
 */


class A{
    public String toString(){
        return super.toString();
    }
}
public class InfiniteRecursion {
    public String toString(){
        return "infiniteRecursion address: " + super.toString() + "\n";
    }

    public static void main(String[] args) {
        List<InfiniteRecursion> v = new ArrayList<InfiniteRecursion>();
        for (int i = 0; i < 5; i++) {
            v.add(new InfiniteRecursion());
        }
        System.out.println(v);

    }
    @Test
    public void test01(){
        System.out.println(new A().toString());
        char[] c = new char[20];
        "1234567".getChars(2,4,c,1);
        for(char c1 : c){
            System.out.print(c1);
        }
    }

    @Test
    public void test02(){
        String aaa = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(aaa.contains("bcd"));
    }
    @Test
    public void test03(){
        int x = 5;
        double y = 5.332423;
        System.out.println(x + " + " + y);
    }
}

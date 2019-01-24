package ThinkingInJava.test.day15_1_18;

import org.junit.Test;

/**
 * @author SGN196
 * @date 2019/1/17 20:42
 */

public class TwoTuple<A,B> {
    public final A first;
    public final B second;
    public TwoTuple(A a, B b){
        first = a;
        second = b;
    }



    @Test
    public void test01(){
        int a = 0;
        System.out.println(new TwoTuple<String, Integer>("aaaa", 1111));
    }
}

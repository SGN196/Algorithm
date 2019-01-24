package ThinkingInJava.test.day15_1_18;

import java.util.ArrayList;

/**
 * @author SGN196
 * @date 2019/1/18 17:55
 */

public class ErasedTypeEquivalence {
    public static void main(String[] args) {
        Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();
        System.out.println(c1 == c2);
    }
}

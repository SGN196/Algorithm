package ThinkingInJava.test.day1_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * @author SGN196
 * @date 2019/1/4 14:39
 */

public class SimpleIteration {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        Iterator iterator = list.iterator();
        for (int i = 0; i < 6; i++) {
            iterator.next();
            iterator.remove();
        }
        System.out.println(list);

    }
}

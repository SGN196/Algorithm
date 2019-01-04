package ThinkingInJava.test.day1_3;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author SGN196
 * @date 2019/1/4 15:27
 */

public class LinkedListFeatrues {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addFirst(11);
        list.offer(22);
        System.out.println(list);

    }
}

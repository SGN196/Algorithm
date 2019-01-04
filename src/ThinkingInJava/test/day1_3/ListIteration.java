package ThinkingInJava.test.day1_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

/**
 * @author SGN196
 * @date 2019/1/4 15:01
 */

public class ListIteration {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        ListIterator<Integer> listIterator = list.listIterator(5);
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        ListIterator<Integer> listIterator1 = list.listIterator(5);
        while(listIterator1.hasPrevious()){
            System.out.println(listIterator1.previous());
        }
    }
}

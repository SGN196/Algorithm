package ThinkingInJava.test.day1_3;

import java.util.Arrays;

/**
 * @author SGN196
 * @date 2019/1/5 12:19
 */

public class ArrayIsNotIterator {
    static <T> void test(Iterable<T> ib){
        for(T t : ib){
            System.out.print(t + " ");
        }
    }



    public static void main(String[] args) {
        test(Arrays.asList(1,2,3,4,5,6,7));
        String[] str = { "A", "B", "C"};
        test(Arrays.asList(str));
        for(String s : str){
            System.out.println(s);
        }
    }
}

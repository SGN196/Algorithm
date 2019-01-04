package ThinkingInJava.test.day1_2;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author SGN196
 * @date 2019/1/3 9:59
 */

public class Test {
    public static class MyComparator implements Comparator<Integer>{
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    }
    @org.junit.Test
    public void test01(){
        PriorityQueue<Integer> queue = new PriorityQueue<>(new MyComparator());
        queue.offer(3);
        queue.offer(2);
        queue.offer(4);
        queue.offer(1);
        queue.offer(5);
        System.out.println(queue.poll());
    }
}

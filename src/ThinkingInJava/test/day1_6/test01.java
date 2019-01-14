package ThinkingInJava.test.day1_6;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author SGN196
 * @date 2019/1/6 17:07
 */


class Apple{
    private int all;
}
public class test01 {
    public static void main(String[] args) {
        Queue<Apple> queue = new PriorityQueue<Apple>();
        queue.offer(new Apple());
        queue.offer(new Apple());
        queue.offer(new Apple());
        queue.offer(new Apple());
        queue.offer(new Apple());
        System.out.println(queue);
    }
}

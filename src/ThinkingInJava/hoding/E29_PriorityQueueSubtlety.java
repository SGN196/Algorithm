package ThinkingInJava.hoding;

import java.util.PriorityQueue;

/**
 * @author SGN196
 * @date 2019/1/5 0:29
 */


class Dummyq{}
public class E29_PriorityQueueSubtlety {
    public static void main(String[] args) {
        PriorityQueue<Dummyq> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < 1; i++) {
            priorityQueue.offer(new Dummyq());
        }

//        System.out.println(priorityQueue);
    }
}

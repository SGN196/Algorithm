package ThinkingInJava.hoding;

import java.util.PriorityQueue;
import java.util.Random;

/**
 * @author SGN196
 * @date 2019/1/5 0:26
 */

public class E28_PriorityQueue {
    static Random random = new Random(47);


    public static void main(String[] args) {
        PriorityQueue<Double> priorityQueue = new PriorityQueue<Double>();
        for (int i = 0; i < 10; i++) {
            priorityQueue.offer(random.nextDouble());
        }
        System.out.println(priorityQueue);
    }
}

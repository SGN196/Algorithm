package ThinkingInJava.test.day1_3;

import java.util.*;

/**
 * @author SGN196
 * @date 2019/1/4 23:05
 */

public class PriorityQueueDemo {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Queue<Integer> priorityQueue = new LinkedList<Integer>();
        Random rand = new Random(47);
        for (int i = 0; i < 100; i++) {
            priorityQueue.offer(rand.nextInt(i + 10));
        }
        System.out.println(System.currentTimeMillis() - start);

        String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";
        List<String> strings = Arrays.asList(fact.split(""));
        System.out.println(strings);
        Collections.reverseOrder();

        Set<Character> charSet = new HashSet<>();
        System.out.println("----------------");
        for(char c : fact.toCharArray()){
            charSet.add(c);
        }
        System.out.println(charSet);


    }
}

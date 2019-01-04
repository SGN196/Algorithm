package ThinkingInJava.test.day1_2;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author SGN196
 * @date 2019/1/3 9:21
 * 类似Huffman树
 */

public class Code_02_Less_Money {
    public static int lessMoney(int[] arr){
        PriorityQueue<Integer> pQ = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pQ.add(arr[i]);
        }
        int sum = 0;
        int cur = 0;
        while(pQ.size() > 1) {
            cur = pQ.poll() + pQ.poll();
            sum += cur;
            pQ.add(cur);
        }
        return sum;
    }
    public static class MinheapComparator implements Comparator<Integer>{
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1-o2;
        }
    }

}

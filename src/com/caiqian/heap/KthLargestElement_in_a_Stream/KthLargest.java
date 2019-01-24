package com.caiqian.heap.KthLargestElement_in_a_Stream;

import java.util.PriorityQueue;

/**
 * @author SGN196
 * @date 2018/12/11 23:49
 *
 * 实现队列接口的某个类，在插入元素时能够排序
 *
 */

public class KthLargest {

    PriorityQueue<Integer> queue;
    public static int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        queue = new PriorityQueue(k);
        for (int i = 0;  i < nums.length; i++)
            queue.offer(nums[i]);
        while(queue.size() > k)
            queue.poll();
    }

    public Integer add(Integer val) {
        if(val == null)
            return null;
        queue.offer(val);
        if(queue.size() < k)
            return null;
        if (queue.size() > k)
            queue.poll();
        //若数组本就是满的

        return queue.peek();
    }




    public static void main(String[] args) {
        int[] a = {4,5,8,2};
        KthLargest kthLargest = new KthLargest(3,a);
        System.out.println(kthLargest.add(3));
        System.out.println(kthLargest.add(5));
        System.out.println(kthLargest.add(10));
        System.out.println(kthLargest.add(9));
        System.out.println(kthLargest.add(4));

    }
}

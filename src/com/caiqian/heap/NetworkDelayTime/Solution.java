package com.caiqian.heap.NetworkDelayTime;

import java.util.*;

/**
 * @author SGN196
 * @date 2019/1/24 18:17
 */

public class Solution {
    public int networkDelayTime(int[][] times, int N, int K) {   //数组、节点个数、开始节点            //源节点、目标节点、距离
        HashSet<Integer>  hashSet = new HashSet<>();
        for (int i = 0; i < times.length; i++) {
            hashSet.add(times[i][0]);
        }
        int[] result = new int[hashSet.size()];





        System.out.println(hashSet.size());
        for (int i = 0; i < times.length; i++) {
            if(times[i][0] == K){



            }
        }


        return 0;
    }


    public static void main(String[] args) {
        int[][] a = {{2, 1, 1}, {2, 3, 1}, {3, 4, 1}};
        new Solution().networkDelayTime(a, 0 , 0);
    }
}

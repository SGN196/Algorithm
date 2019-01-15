package com.caiqian.Dynamic.MinCostClimbingStairs;

/**
 * @author SGN196
 * @date 2019/1/15 11:42
 */

public class Solution {

    public int minCostClimbingStairs(int[] cost) {
        if (cost.length == 2) {
            return Math.min(cost[0], cost[1]);
        }
        int last;
        int lastOfLast;

        lastOfLast = cost[0];
        last = Math.min(cost[1] , lastOfLast + cost[1]);
        int cur;
        for (int i = 2; i < cost.length; i++) {
            cur = Math.min(last + cost[i], lastOfLast + cost[i]);
            lastOfLast = last;
            last = cur;
        }
        return Math.min(last, lastOfLast);
    }
//       int[] arr;
//
//    public int minCostClimbingStairs(int[] cost) {
//        if (cost.length == 2) {
//            return Math.min(cost[0], cost[1]);
//        }
//
//        arr = new int[cost.length];
//        arr[0] = cost[0];
//        arr[1] = Math.min(cost[1] , arr[0] + cost[1]);
//        for (int i = 2; i < cost.length; i++) {
//            arr[i] = Math.min(arr[i - 1] + cost[i], arr[i - 2] + cost[i]);
//        }
//        return Math.min(arr[cost.length - 2], arr[cost.length - 1]);
//    }

    public static void main(String[] args) {
        int[] a = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1}; //6
        int[] b = {0, 1, 1, 1}; //1
        int[] c = {0, 0, 1, 1}; // 1
        int[] d = {0, 1, 1, 0}; //1
        System.out.println(new Solution().minCostClimbingStairs(d));
    }
}

package com.caiqian.Dynamic.ClimbingStairs;

/**
 * @author SGN196
 * @date 2019/1/14 22:03
 */

public class Solution {
    public static int[] x = new int[47];
    public Solution(){
        x[0] = 0;
        x[1] = 1;
        x[2] = 2;
        int i = 1;
        int j = 2;
        for (int k = 3; k < 47 ; k++) {
            j = i + j;
            i = j - i;
            x[k] = j;
            System.out.println(j + " " + k);
        }
    }

    public int climbStairs(int n) {

        return x[n];
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        new Solution();
    }


}

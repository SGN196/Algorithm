package com.caiqian.Dynamic.MaximumSubarray;

/**
 * @author SGN196
 * @date 2019/1/14 23:36
 */

public class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int res = 0;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            res += num;
            if (res > max) {
                max = res;
            }
            if (res < 0) {
                res = 0;
            }
        }
        return max;
    }
}

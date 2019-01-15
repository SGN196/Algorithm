package com.caiqian.Dynamic.HomeRobber;

/**
 * @author SGN196
 * @date 2019/1/14 22:50
 */

public class Solution {

    int[] arr;

    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }

        arr = new int[nums.length];
        arr[0] = nums[0];
        arr[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            if (arr[i - 2] == arr[i - 1]) {    //没偷上一家
                arr[i] = arr[i - 2] + nums[i];               //下一家肯定先偷为敬
            } else {                          //偷了上一家
                if ((arr[i - 2] + nums[i]) > arr[i - 1]) {  //判断偷上一家是不是正确
                    arr[i] = arr[i - 2] + nums[i];
                } else {
                    arr[i] = arr[i - 1];
                }
            }

        }
        return arr[nums.length - 1];
    }
}

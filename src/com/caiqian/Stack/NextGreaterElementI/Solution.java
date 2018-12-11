package com.caiqian.Stack.NextGreaterElementI;

/**
 * @author SGN196
 * @date 2018/12/11 0:37
 */

public class Solution {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Integer flag;
        Integer max;
        if(nums1 == null || nums2 == null){
            return null;
        }
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            flag = null;
            max = null;
            for (int j = 0; j < nums2.length; j++) {
                if(nums2[j] == nums1[i]){
                    flag = nums2[j];
                }
                if(flag != null){
                    if(nums2[j] > flag) {
                        result[i] = nums2[j];
                        max = nums2[j];
                        break;
                    }
                }
            }
            if(max == null){
                result[i] = -1;
            }
        }



        return result;
    }

    public static void main(String[] args) {
        int[] a ={4,1,2};
    }
}

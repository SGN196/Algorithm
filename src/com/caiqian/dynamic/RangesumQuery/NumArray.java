package com.caiqian.dynamic.RangesumQuery;

/**
 * @author SGN196
 * @date 2019/1/14 18:49
 */




public class NumArray {

    private int[] arr;
    public NumArray(int[] nums) {
        arr = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            arr[i] = sum;

        }
    }

    public int sumRange(int i, int j) {
        if(i == 0){
            return arr[j];
        }
        else
            return arr[j] - arr[i - 1];
    }

    public static void main(String[] args) {
        int[] a = {-2, 0, 3, -5, 2, -1};
        NumArray n = new NumArray(a);
        System.out.println(n.sumRange(2,5));
    }
}

package com.caiqian.Arrays.SortArrayByParity;

/**
 * @author SGN196
 * @date 2018/12/24 13:00
 * 给定一个非负整数数组 A，返回一个由 A 的所有偶数元素组成的数组，后面跟 A 的所有奇数元素。
 *
 * 你可以返回满足此条件的任何数组作为答案。
 *
 *
 *
 * 示例：
 *
 * 输入：[3,1,2,4]
 * 输出：[2,4,3,1]
 * 输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
 *
 *
 * 提示：
 *
 * 1 <= A.length <= 5000
 * 0 <= A[i] <= 5000
 */

public class Solution {

    public int[] sortArrayByParity(int[] A) {
        int index = 0;
        int more = A.length - 1;
        while(index != more){
            while(A[index] % 2 == 0 && more!=index){
                index++;
            }
            while(A[more] % 2 == 1 && more!=index){
                more--;
            }
            if(index != more)
                swap(A, index, more);
        }
        return A;
    }
    public static void swap(int[] a, int less, int more){
        int temp = a[less];
        a[less] = a[more];
        a[more] = temp;
    }
    public static int[] generateRandomArray(int size, int value){
        int[] arr = new int[(int)((size + 1) * Math.random())];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)((value + 1) * Math.random());
        }
        return arr;
    }
    public static void show(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = generateRandomArray(20, 50);
        Solution  sp = new Solution();

        show(sp.sortArrayByParity(a));

    }
}

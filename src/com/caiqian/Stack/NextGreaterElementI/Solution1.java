package com.caiqian.Stack.NextGreaterElementI;

import java.util.Stack;

/**
 * @author SGN196
 * @date 2018/12/11 10:00
 *
 * 逻辑出错，错误的把队列当成了栈，
 */

public class Solution1 {

    static Stack<Integer>stack;

    public Solution1(){
        stack = new Stack<Integer>();
    }

    public static void createStack(int[] nums2){
        stack = new Stack<Integer>();
        for (int i = 0; i < nums2.length; i++) {
            stack.push(nums2[i]);
        }
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        if(nums1 == null || nums2 == null)
            return null;
        int[] result = new int[nums1.length];
        Integer flag;
        Integer max;
        for (int j = 0; j < nums1.length; j++) {
            flag = null;
            max = null;
            createStack(nums2);
            for (int i = 0; i < nums2.length; i++) {
                if(!stack.isEmpty()){
                    if(flag == null) {
                        if (stack.pop() == nums1[j]) {
                            flag = nums1[j];
                        }
                    }
                    if(flag !=null){
                        if(stack.peek() > flag){
                            max = stack.pop();
                            break;
                        }else {
                            stack.pop();
                        }
                    }
                }

            }
            if(max != null){
                result[j] = max;
            }



        }
        return result;
    }
}

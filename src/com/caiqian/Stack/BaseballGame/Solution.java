package com.caiqian.Stack.BaseballGame;

import java.util.Stack;

/**
 * @author SGN196
 * @date 2018/12/11 18:26
 */

public class Solution {



    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < ops.length; i++) {
            switch ( ops[i].charAt(0) ) {
                case '+':
                    Integer last = stack.pop();
                    Integer lastBeforeLast = stack.peek();
                    stack.push(last);
                    stack.push(last + lastBeforeLast); break;
                case 'D':
                    stack.push(stack.peek() * 2); break;
                case 'C':
                    stack.pop(); break;
                default:
                    stack.push(Integer.parseInt(ops[i])); break;
            }
        }
        Integer total = 0;
        while (!stack.isEmpty()) {
            total += stack.pop();
        }
        return total;
    }

    public static void main(String[] args) {
        String[] a = {"5","-2","4","C","D","9","+","+"};
        Solution solution = new Solution();
        System.out.println( solution.calPoints(a));
    }

}

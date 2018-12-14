package com.caiqian.Stack.BackspaceStringCompare;

import java.util.Stack;

/**
 * @author SGN196
 * @date 2018/12/11 23:25
 */

public class Solution {






    public boolean backspaceCompare(String S, String T) {
        if(S == null && T == null){
            return true;
        }
        if(S == null || T == null){
            return false;
        }

        Stack<Character> stack1 = new Stack<Character>();
        Stack<Character> stack2 = new Stack<Character>();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if(c == '#'){
                if(!stack1.isEmpty())
                    stack1.pop();
            }else{
                stack1.push(c);
            }
        }
        for (int j = 0; j < T.length(); j++){
            char c = T.charAt(j);
            if(c == '#'){
                if(!stack2.isEmpty())
                  stack2.pop();
            }else{
                stack2.push(c);
            }
        }
        while(!stack1.isEmpty() && !stack2.isEmpty()){
            if(stack1.pop() != stack2.pop()){
                return false;
            }
        }
        if(!stack1.isEmpty() || !stack2.isEmpty()){
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.backspaceCompare("a##c","#a#c"));
    }
}

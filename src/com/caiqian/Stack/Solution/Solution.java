package com.caiqian.Stack.Solution;

import java.util.HashMap;
import java.util.Stack;


/**
 * firstTime = 2018-12-07
 *
 * 传入的值是：((([[[{{}}[[[（类似这样的字符串）
 */
public class Solution {
    HashMap<Character, Character> map1;
    HashMap<Character, Character> map2;

    public Solution(){
        map1 = new HashMap<Character, Character>();
        map2 = new HashMap<Character, Character>();
        map1.put('{', '}');
        map1.put('(', ')');
        map1.put('[', ']');

        map2.put('}', '{');
        map2.put(')', '(');
        map2.put(']', '[');


    }


    public boolean isValid(String s) {
        char[] c = new char[s.length()];
        Stack<Character> stack = new Stack<Character>();



        for (int i = 0; i < s.length(); i++) {
            c[i] = s.charAt(i);
            if(map1.containsKey(c[i])){   //当前符号为左括号时
                stack.push(c[i]);
            }else {
                if (map2.containsKey(c[i])) {           //当前符号为右括号时
                    if(stack.empty()){                  //则不能为空
                        return false;
                    }
                    char temp = stack.pop();
                    if(map2.get(c[i]) != temp){
                        return false;
                    }

                }else{
                    return false;           //输入值不符合要求
                }
            }

        }
        if(stack.empty())
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String abc = "(((";
        solution.isValid(abc);
    }


}

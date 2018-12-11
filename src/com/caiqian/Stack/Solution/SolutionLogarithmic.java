package com.caiqian.Stack.Solution;

import java.util.HashMap;
import java.util.Stack;

public class SolutionLogarithmic {
    private HashMap<Character, Character> mappings;

    // Initialize hash map with mappings. This simply makes the code easier to read.
    public SolutionLogarithmic() {
        this.mappings = new HashMap<Character, Character>();
        this.mappings.put(')', '(');
        this.mappings.put('}', '{');
        this.mappings.put(']', '[');
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If the current character is a closing bracket.
            if (this.mappings.containsKey(c)) {

                // Get the top element of the stack. If the stack is empty, set a dummy value of '#'
                char topElement = stack.empty() ? '#' : stack.pop();

                // If the mapping for this bracket doesn't match the stack's top element, return false.
                if (topElement != this.mappings.get(c)) {
                    return false;
                }
            } else {
                // If it was an opening bracket, push to the stack.
                stack.push(c);
            }
        }

        // If the stack still contains elements, then it is an invalid expression.
        return stack.isEmpty();
    }
    public static String generateRandomString(){
        char[] c = new char[6];
        c[0] = '(';
        c[1] = '[';
        c[2] = '{';
        c[3] = '}';
        c[4] = ']';
        c[5] = ')';
        return generateRandomString(2000,c );
    }

    public static String generateRandomString(int size, char[] value){
        int val = value.length;
        char[] c = new char[(int)(Math.random() * (size + 1))];
        for (int i = 0; i < c.length; i++) {
            c[i] = value[(int) ((value.length) * Math.random())];
        }
        return new String(c, 0, c.length);


    }


    public static boolean isOK(){
        for (int i = 0; i < 200000; i++) {
            String a = generateRandomString();
            String b = new String(a);
            String c = new String(a);
            SolutionLogarithmic solutionLogarithmic = new SolutionLogarithmic(); //绝对正确
            Solution solution = new Solution();
            if(solution.isValid(c) != solutionLogarithmic.isValid(b)){
                System.out.println(a);
                return false;
            }
        }
        System.out.println("good!");
        return true;
    }


    public static void main(String[] args) {

        isOK();

    }
}

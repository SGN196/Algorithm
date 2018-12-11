package com.caiqian.Stack.MinStack;

import java.util.Stack;

public class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
       stack = new Stack<Integer>();
       minStack = new Stack<Integer>();
    }

    public void push(Integer x) {
        if(x == null)
            return;
        if(minStack.empty()){
            minStack.push(x);
        }else{
            if(minStack.peek() >= x){           //注意相同的最小值，需要多次保存到最小数组中
                minStack.push(x);
            }
        }
        stack.push(x);
    }

    public void pop() {
        if(!stack.isEmpty()) {
            if(!minStack.isEmpty()) {
                if (stack.peek() == minStack.peek()) {
                    minStack.pop();
                }
            }
            stack.pop();
        }
    }

    public Integer top() {
        if(!stack.isEmpty())
            return stack.peek();
        else
            return null;
    }

    public Integer getMin() {

        if(!minStack.isEmpty())
            return minStack.peek();
        else
            return null;
    }
}

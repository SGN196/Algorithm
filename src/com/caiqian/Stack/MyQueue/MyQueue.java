package com.caiqian.Stack.MyQueue;

import java.util.Stack;

/**
 * @author SGN196
 * @date 2018/12/10 1:14
 */

public class MyQueue {

    Stack<Integer> stackfirst;
    Stack<Integer> stacksecond;
    public void swap(Stack<Integer> stackfirst, Stack<Integer> stacksecond){
        if(stacksecond.empty()){
            while(!stackfirst.empty()){
                stacksecond.push(stackfirst.pop());
            }
        }
    }
    /** Initialize your data structure here. */
    public MyQueue() {
        stackfirst = new Stack<Integer>();
        stacksecond = new Stack<Integer>();
    }

    /** Push element x to the back of queue. */
    public void push(Integer x) {
        if(x == null)
            return;
        stackfirst.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public Integer pop() {
        if(stackfirst.empty() && stacksecond.empty())
            return null;
        if(stacksecond.empty()){
            swap(stackfirst, stacksecond);
        }
        return stacksecond.pop();
    }

    /** Get the front element. */
    public Integer peek() {
        if(stackfirst.empty() && stacksecond.empty())
            return null;
        if(stacksecond.empty()){
            swap(stackfirst, stacksecond);
        }
        return stacksecond.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(stackfirst.empty() && stacksecond.empty())
            return true;
        return false;
    }
}

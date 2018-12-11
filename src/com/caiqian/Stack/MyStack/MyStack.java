package com.caiqian.Stack.MyStack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author SGN196
 * @date 2018/12/10 23:54
 */

public class MyStack  {

    Queue<Integer> queueFirst;
    Queue<Integer> queueSecond;


    /** Initialize your data structure here. */
    public MyStack() {
        queueFirst = new LinkedList<Integer>();
        queueSecond = new LinkedList<Integer>();
    }
    public static void swap(Queue queueFirst, Queue queueSecond){


    }

    /** Push element x onto stack. */
    public void push(Integer x) {
        if(x == null){
            return;
        }
        queueSecond = queueFirst;
        queueFirst = new LinkedList<Integer>();
        queueFirst.offer(x);
        while(!queueSecond.isEmpty()){
            queueFirst.offer(queueSecond.poll());
        }

    }

    /** Removes the element on top of the stack and returns that element. */
    public Integer pop() {
        if (!queueFirst.isEmpty())
            return queueFirst.poll();
        return null;
    }

    /** Get the top element. */
    public Integer top() {
        if(!queueFirst.isEmpty()){
            return queueFirst.peek();
        }
        return null;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {

        return queueFirst.isEmpty();

    }
}

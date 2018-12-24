package com.caiqian.Stack.MyStack;

import java.util.LinkedList;

/**
 * @author SGN196
 * @date 2018/12/23 15:48
 *
 * 缺点：每一次查看最后的值，都需进出栈全部队列
 */

public class MyStack2 {
    private LinkedList<Integer> help;
    private LinkedList<Integer> data;

    MyStack2(){
        help = new LinkedList<Integer>();
        data = new LinkedList<Integer>();

    }

    public void push(Integer num){
        if(num == null)
            return;
        data.offer(num);
    }

    public Integer pop(){
        if(data.isEmpty())
            return null;
        while(data.size() > 1){
            help.offer(data.poll());
        }
        Integer res = data.poll();
        swap();
        return res;
    }
    public Integer peek(){
        if(data.isEmpty()){
            return null;
        }
        while(data.size() > 1){
            help.offer(data.poll());
        }
        Integer res = data.poll();
        swap();
        data.offer(res);

        return res;

    }
    public void swap(){
        LinkedList<Integer> tmp = help;
        help = data;
        data = tmp;
    }
}

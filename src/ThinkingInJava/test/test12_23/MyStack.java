package ThinkingInJava.test.test12_23;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author SGN196
 * @date 2018/12/23 11:21
 */

public class MyStack {
    private Queue<Integer> data;
    private Queue<Integer> help;

    MyStack(){
        data  = new LinkedList<Integer>();
        help = new LinkedList<Integer>();
    }
    public void push(Integer pushInt){
        if(pushInt == null){
            return;
        }
        data.add(pushInt);
    }

    public int peek(){
        if(data.isEmpty())
            throw new RuntimeException("stack is empty");
        while(data.size() != 1){
            help.offer(data.poll());
        }
        int res = data.poll();
        swap();
        data.offer(res);
        return res;
    }

    public int pop(){
        if(data.isEmpty())
            return 0;
        while(data.size() >= 1){
            help.offer(data.poll());
        }
        int res = data.poll();
        swap();
        return res;
    }





    public void swap(){
        Queue<Integer> tmp = help;
        help = data;
        data = tmp;
    }

}

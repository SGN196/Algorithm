package ThinkingInJava.test.test12_23;

import java.util.Stack;

/**
 * @author SGN196
 * @date 2018/12/23 16:27
 */

public class MyQueue {
    private Stack<Integer> push;
    private Stack<Integer> pop;
    public MyQueue(){
        push = new Stack<Integer>();
        pop = new Stack<Integer>();
    }

    public void offer(Integer num){
        if(num == null){
            return ;
        }
        push.push(num);
    }

    public Integer poll(){
        if(pop.isEmpty() && push.isEmpty()){
            throw new RuntimeException("is not data");
        }
        if(pop.isEmpty()){
            while(!push.isEmpty())
                pop.push(push.pop());
        }
        return pop.pop();
    }
    public Integer peek(){
        if(pop.isEmpty() && push.isEmpty()){
            throw new RuntimeException("is not data");
        }
        if(pop.isEmpty()){
            while(!push.isEmpty())
                pop.push(push.pop());
        }
        return pop.peek();
    }




}

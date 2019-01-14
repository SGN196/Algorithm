package ThinkingInJava.test.day1_3;

import net.mindview.util.ContainerMethodDifferences;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author SGN196
 * @date 2019/1/5 13:28
 */

public class MyStack {
    private LinkedList<Integer> stack;

    public MyStack(){
        stack = new LinkedList<Integer>();
    }

    public void push(Integer i){
        if(i == null)
            throw new RuntimeException();
        stack.offer(i);
    }


    public Integer peek(){
        if(stack.isEmpty())
            return null;
        return stack.peekLast();
    }


    public Integer pop(){
        if(stack.isEmpty()){
            return null;
        }
        return stack.pollLast();
    }

    public static void main(String[] args) {
        MyStack m  = new MyStack();

        for (int i = 0; i < 5; i++) {
            m.push(i);
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(m.pop());
        }

        Queue<Integer> queue = new PriorityQueue<>();

        ContainerMethodDifferences.main(args);





        
    }
}

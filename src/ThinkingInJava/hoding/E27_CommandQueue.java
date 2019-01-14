package ThinkingInJava.hoding;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author SGN196
 * @date 2019/1/4 22:29
 */


class Command{
    private final String cmd;
    Command(String cmd){
        this.cmd = cmd;
    }
    public void operation(){
        System.out.println(cmd);
    }
}
class Producer{
    public static void produce(Queue<Command> q){
        q.offer(new Command("a"));
        q.offer(new Command("b"));
        q.offer(new Command("c"));
        q.offer(new Command("d"));

    }
}
class Consumer{
    public static void consumer(Queue<Command> q){
        while(!q.isEmpty()){
            q.poll().operation();
        }
    }
}




public class E27_CommandQueue {
    public static void main(String[] args) {
        Queue<Command> cmds = new LinkedList<>();
        new Producer().produce(cmds);
        new Consumer().consumer(cmds);


    }
}

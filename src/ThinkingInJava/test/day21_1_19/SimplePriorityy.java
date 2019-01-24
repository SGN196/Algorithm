package ThinkingInJava.test.day21_1_19;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author SGN196
 * @date 2019/1/21 12:53
 */

public class SimplePriorityy implements Runnable {
    private int count = 10;
    private volatile double d;
    private int priority;
    public SimplePriorityy(int priority){
        this.priority = priority;
    }

    public String toString(){
        return Thread.currentThread() + " : " + count;
    }
    @Override
    public void run() {
        Thread.currentThread().setPriority(priority);
        while(true){
            for (int i = 1; i < 100000; i++) {
                d += (Math.PI + Math.E)/(double)i;
                if( i %10000 == 0){
              //      Thread.yield();
                }

            }

            System.out.println(this);
            if(--count == 0) return;
        }

    }


    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            exec.execute(new SimplePriorityy(Thread.MIN_PRIORITY));
        }
        exec.execute(new SimplePriorityy(Thread.MAX_PRIORITY));
        exec.shutdown();
    }
}

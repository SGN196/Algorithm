package ThinkingInJava.test.day21_1_19;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author SGN196
 * @date 2019/1/23 21:39
 */

public class AtomicIntegerTest implements Runnable {

    private AtomicInteger i = new AtomicInteger(0);
    public synchronized int getValue(){
        return i.get();
    }
    private synchronized void evenIncrement(){
        i.addAndGet(1);
        i.addAndGet(1);
    }



    @Override
    public void run() {
        while(true){
            evenIncrement();
        }
    }

    public static void main(String[] args) {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                System.err.println("abouting");
                System.exit(0);
            }
        }, 5000);
        ExecutorService exec = Executors.newCachedThreadPool();
        AtomicIntegerTest ait = new AtomicIntegerTest();
        exec.execute(ait);
        while(true){
            int val = ait.getValue();
            if(val %2 != 0){
                System.out.println(val);
                System.exit(0);
            }
        }
    }
}

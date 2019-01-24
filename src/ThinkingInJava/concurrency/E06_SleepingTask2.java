package ThinkingInJava.concurrency;

import ThinkingInJava.test.day21_1_19.SleepingTask;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author SGN196
 * @date 2019/1/21 0:20
 */

class SleepingTask2 implements Runnable{
    private static Random rand = new Random(47);

    @Override
    public void run() {
        int r = rand.nextInt(10) + 1;
        try {
            TimeUnit.SECONDS.sleep(r);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class E06_SleepingTask2 {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            exec.execute(new SleepingTask());
        }
        exec.shutdown();
    }
}

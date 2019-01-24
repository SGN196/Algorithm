package ThinkingInJava.concurrency;

import ThinkingInJava.test.day21_1_19.LiftOff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author SGN196
 * @date 2019/1/21 19:06
 */

public class E08_MoreBasicDaemonThreads {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();

        for (int i = 0; i < 5; i++) {
            Thread t = new Thread(new LiftOff());
            t.setDaemon(true);
            t.start();
        }

    }
}

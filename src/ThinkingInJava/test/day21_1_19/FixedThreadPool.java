package ThinkingInJava.test.day21_1_19;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author SGN196
 * @date 2019/1/20 2:40
 */

public class FixedThreadPool {
    public static void main(String[] args) {

        ExecutorService e = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 10; i++) {
            e.execute(new LiftOff());
        }
        e.shutdown();

    }
}

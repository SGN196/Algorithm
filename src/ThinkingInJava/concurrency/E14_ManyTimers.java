package ThinkingInJava.concurrency;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author SGN196
 * @date 2019/1/23 22:23
 */

public class E14_ManyTimers  {
    public static void main(String[] args) {
        int time = 1000;
        for (int i = 0; i < time; i++) {
            new Timer().schedule(new TimerTask() {
                @Override
                public void run() {
                    System.out.println(System.currentTimeMillis() + " ");
                }
            }, time - i);

        }
    }
}

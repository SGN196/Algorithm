package ThinkingInJava.test.day21_1_19;

import java.util.concurrent.ThreadFactory;

/**
 * @author SGN196
 * @date 2019/1/21 18:15
 */

public class DaemonThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setDaemon(true);
        return t;
    }
}

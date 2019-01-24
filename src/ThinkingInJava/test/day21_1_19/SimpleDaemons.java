package ThinkingInJava.test.day21_1_19;

import java.util.concurrent.TimeUnit;

/**
 * @author SGN196
 * @date 2019/1/21 17:58
 */

public class SimpleDaemons implements Runnable {
    @Override
    public void run() {
        try {
            while(true){
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread() + " : " + this);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception{
        for (int i = 0; i < 10; i++) {
            Thread daemon = new Thread(new SimpleDaemons());
            daemon.setDaemon(true);
            daemon.start();
        }
        System.out.println("All daemons start");
        TimeUnit.MILLISECONDS.sleep(99);
    }
}

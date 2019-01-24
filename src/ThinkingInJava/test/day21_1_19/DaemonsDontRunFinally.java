package ThinkingInJava.test.day21_1_19;

import java.util.concurrent.TimeUnit;

/**
 * @author SGN196
 * @date 2019/1/21 18:34
 */

class ADaemon implements Runnable  {
    @Override
    public void run() {
        try {
            System.out.println("start Adaemon");
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("this should always run?");
        }
    }
}


public class DaemonsDontRunFinally{
    public static void main(String[] args) throws Exception{
        Thread t = new Thread(new ADaemon());
        t.setDaemon(true);
        t.start();


//        TimeUnit.SECONDS.sleep(100);

    }
}

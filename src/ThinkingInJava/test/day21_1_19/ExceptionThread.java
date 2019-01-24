package ThinkingInJava.test.day21_1_19;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author SGN196
 * @date 2019/1/22 2:08
 */

public class ExceptionThread implements Runnable
{
    @Override
    public void run() {
        while(true)
          throw new RuntimeException();
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        try {
            exec.execute(new ExceptionThread());
            exec.shutdown();
        }catch (Exception e){
            e.printStackTrace();
            System.out.println();
        }
        System.out.println("------------");
    }
}

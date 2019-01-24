package ThinkingInJava.test.day21_1_19;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author SGN196
 * @date 2019/1/23 22:00
 */

public class AtomicEvenGenerator extends IntGenerator {
    AtomicInteger currentEvenValue = new AtomicInteger(0);

    @Override
    public int next() {
        try{
            currentEvenValue.addAndGet(1);
            Thread.yield();
            currentEvenValue.addAndGet(1);
            return currentEvenValue.get();
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    public static void main(String[] args) {
        EvenChecker.test(new AtomicEvenGenerator());
    }
}

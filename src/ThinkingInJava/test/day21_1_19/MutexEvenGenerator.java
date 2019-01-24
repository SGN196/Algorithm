package ThinkingInJava.test.day21_1_19;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author SGN196
 * @date 2019/1/22 23:27
 */

public class MutexEvenGenerator extends IntGenerator {
    private int currentEvenValue = 0;
    private Lock lock = new ReentrantLock();
    @Override
    public int next() {
        lock.lock();
        try {
            ++currentEvenValue;
            Thread.yield();
            ++currentEvenValue;
            return currentEvenValue;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
        return 0;
    }
}

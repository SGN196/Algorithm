package ThinkingInJava.test.day21_1_19;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author SGN196
 * @date 2019/1/24 16:58
 */
abstract class Incrementable{
    protected long counter = 0;
    public abstract void increment();
}

class SysnchronizingTest extends Incrementable{
    public synchronized void increment(){
        ++counter;
    }
}
class LockingTest extends Incrementable{
    private Lock lock = new ReentrantLock();
    public void increment(){
        lock.lock();
        try{
            ++counter;
        }finally{
            lock.unlock();
        }
    }

}


public class SimpleMicroBenchmarkk {
    static long test(Incrementable incr){
        long start = System.nanoTime();
        for(long i = 0; i < 10000000L; i++){
            incr.increment();
        }
        return System.nanoTime() - start;
    }

    public static void main(String[] args) {
        long synchTime = test(new SysnchronizingTest());
        long lockTime = test(new LockingTest());
        System.out.printf("synchronized: %1$10d\n", synchTime);
        System.out.printf("lock        : %1$10d\n", lockTime);

    }
}

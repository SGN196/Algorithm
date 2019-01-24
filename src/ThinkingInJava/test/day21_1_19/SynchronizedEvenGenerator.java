package ThinkingInJava.test.day21_1_19;

import org.junit.Test;

/**
 * @author SGN196
 * @date 2019/1/22 21:13
 */

public class SynchronizedEvenGenerator extends IntGenerator {
    private int currentEvenValue = 0;

    @Override
    public synchronized int next() {
        ++currentEvenValue;
        Thread.yield();
        ++currentEvenValue;
        return currentEvenValue;

    }

    public static void main(String[] args) {
        EvenChecker.test(new SynchronizedEvenGenerator());
    }
    @Test
    public void test01(){
        String str1 = "ab";
        String str2 = "a" + "b";
        System.out.println(str1 == str2);
    }
}

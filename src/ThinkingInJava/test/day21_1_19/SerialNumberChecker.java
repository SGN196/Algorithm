package ThinkingInJava.test.day21_1_19;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author SGN196
 * @date 2019/1/23 21:05
 */

class CircularSet{
    private int[] array;
    private int len;
    private int index = 0;
    public CircularSet(int size){
        array = new int[size];
        len = size;
        for (int i = 0; i < size; i++) {
            array[i] = -1;
        }
    }
    public synchronized void add(int i){
        array[index] = i;
        index = ++index % len;
    }
    public synchronized boolean contains(int val){
        for (int i = 0; i < len; i++) {
            if(array[i] == val){
                return true;
            }
        }
        return false;
    }
}
class SerialNumberGenerator{
    private static volatile int serialNumber = 0;
    public static  synchronized int nextSerialNumber(){
        return serialNumber++;
    }
}

public class SerialNumberChecker {
    private static final int SIZE = 10;
    private static CircularSet serials = new CircularSet(1000);
    private static ExecutorService exec = Executors.newCachedThreadPool();
    static class SerialChecker implements Runnable{
        public void run(){
            while(true){

                    int serial = SerialNumberGenerator.nextSerialNumber();
                    if (serials.contains(serial)) {
                        System.out.println(Thread.currentThread() + "--duplicate : " + serial);
                    }
                    serials.add(serial);

            }
        }
    }

    public static void main(String[] args) throws  Exception{
        for (int i = 0; i < SIZE; i++) {
            exec.execute(new SerialChecker());

        }

    }
}

package ThinkingInJava.concurrency;

import java.util.Arrays;

/**
 * @author SGN196
 * @date 2019/1/20 2:10
 */

class Fibonacci implements Runnable{
    public final int NUM;
    public Fibonacci(){
        NUM = 0;
    }
    public Fibonacci(int num){
        NUM = num;
    }

    public Integer sum(){
        return F(NUM);
    }

    public static int F(int x){
        if(x < 2) return 1;
        return F(x - 1) + F(x - 2);
    }
    public int next(int x){
        return F(x);
    }


    @Override
    public void run() {
        int[] i = new int[NUM];
        for (int j = 0; j < NUM; j++) {
            i[j] = F(j);
        }
        System.out.println("num = " + NUM + "-------" +  Arrays.toString(i));
    }
}

public class E02_Fibonacci {
    public static void main(String[] args) {
        for (int i = 0; i < 40; i++) {

           new Thread(new Fibonacci(i)).start();
        }

    }
}

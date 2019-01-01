package ThinkingInJava.test.test12_21;

import java.util.Random;

/**
 * @author SGN196
 * @date 2018/12/21 11:18
 */

interface StaticFinalTest{
    Random RAND = new Random(47);
    int rand_int = RAND.nextInt(10);
    long rand_long = RAND.nextLong() * 10;;
}
class aaa implements StaticFinalTest{
    int abc = 2;
}

public class E17_ImplicitStaticFinal {
    public static void main(String[] args) {
        StaticFinalTest a = new aaa();

        System.out.println(StaticFinalTest.rand_int);
        System.out.println(StaticFinalTest.rand_long);
    }
}

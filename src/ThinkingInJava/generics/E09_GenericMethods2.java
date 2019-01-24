package ThinkingInJava.generics;

import java.util.Random;

/**
 * @author SGN196
 * @date 2019/1/18 16:13
 */

public class E09_GenericMethods2 {
    public <A,B,C> void f(A a, B b, int c)
    {
        System.out.println(a.getClass().getName());
        System.out.println(b.getClass().getName());
        System.out.println(c);
    }

    public static void main(String[] args) {
        E09_GenericMethods2 gg = new E09_GenericMethods2();

        gg.f(new E09_GenericMethods2(), new Random(), 1);

    }
}

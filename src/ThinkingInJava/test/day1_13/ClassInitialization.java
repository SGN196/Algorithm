package ThinkingInJava.test.day1_13;

import java.util.Random;

/**
 * @author SGN196
 * @date 2019/1/13 11:21
 */

class Initable{
    static final int staticFinal = 47;
    static final int staticFinal2 = ClassInitialization.rand.nextInt(1000);
    static {
        System.out.println("iinitable1.class");
    }
}
class Initaable2{
    static int staticNonFinal = 147;
    static{
        System.out.println("initable2.class");
    }
}

public class ClassInitialization {
    public static Random rand = new Random(47);

    public static void main(String[] args) {
        Class initable = Initable.class;
        System.out.println("----------------");
        System.out.println(Initable.staticFinal);
        System.out.println(Initable.staticFinal2);
        System.out.println(Initaable2.staticNonFinal);

    }
}

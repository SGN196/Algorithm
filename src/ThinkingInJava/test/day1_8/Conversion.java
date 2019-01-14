package ThinkingInJava.test.day1_8;

import java.util.Formatter;

/**
 * @author SGN196
 * @date 2019/1/9 17:19
 */

public class Conversion {
    public static void main(String[] args) {
        Formatter f = new Formatter(System.out);
        char u = 'a';
        f.format("%c\n", u);
//        f.format("%d\n", u);
        f.format("%c\n", u);
        f.format("%b\n", u);
//        f.format("%f\n", u);
//        f.format("%e\n", u);
//        f.format("%x\n", u);
        f.format("%h\n", u);

        System.out.println("----------------");

        Conversion y = new Conversion();
//        f.format("%d\n", u);
//        f.format("%c\n", u);
        f.format("%b\n", y);
        f.format("%s\n", y);
//        f.format("%f\n", u);
//        f.format("%e\n", u);
//        f.format("%x\n", u);
        f.format("%h\n", y);
        int a = 0;
        f.format("%b", a);
    }
}

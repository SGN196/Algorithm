package ThinkingInJava;

import org.junit.Test;

import java.util.Formatter;
import java.util.Locale;

/**
 * @author SGN196
 * @date 2019/1/9 17:58
 */

public class E05_ComplexConversion {
    public static void main(String[] args) {

    }

    @Test
    public void test01(){
        Formatter f = new Formatter(System.out, Locale.US);
        char u = 'a';
//        f.format("%1$-#10s\n", u);
        f.format("%1$-10c", u);
        System.out.println("-");
        String.format("t");
    }
}

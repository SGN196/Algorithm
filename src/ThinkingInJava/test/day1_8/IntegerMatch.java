package ThinkingInJava.test.day1_8;

import java.util.regex.Pattern;

/**
 * @author SGN196
 * @date 2019/1/9 21:34
 */

public class IntegerMatch {
    public static void main(String[] args) {
        System.out.println("1234".matches("-?\\d+"));
        System.out.println(Pattern.matches("-?\\d+", "1234"));
        System.out.println("-5678".matches("-?\\d+"));
        System.out.println("+911".matches("-?\\d+"));
        System.out.println("+911".matches("(-|\\+)?\\d+"));
        System.out.println("0".matches("(-|\\+)?\\d+"));
        int a = +333;
        System.out.println(a);
    }
}

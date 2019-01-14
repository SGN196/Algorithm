package ThinkingInJava.test.day1_10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author SGN196
 * @date 2019/1/10 20:24
 */

public class TestRegularExpression {
    public static void main(String[] args) {
        String str1 = "abcabcabcdefabc";
        String str2 = "abc+";
        Pattern pattern = Pattern.compile(str1);
        Matcher matcher = pattern.matcher(str2);
        System.out.println(matcher.group());
    }
}

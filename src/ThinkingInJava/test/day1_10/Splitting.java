package ThinkingInJava.test.day1_10;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author SGN196
 * @date 2019/1/10 10:50
 */

public class Splitting {
    public static String knights = "AThen,when the you have hound the shrubbery, you must cut down the mightiest tree in the forest.. with... a herring!";

    public static void split(String regex) {
        System.out.println(Arrays.toString(knights.split(regex)));
    }
    public static String stu = "I am a Student!";

    @Test
    public void test11(){
        String str = "abcabcabcabc";
        System.out.println(str.matches("(abc)+?"));
    }

    @Test
    public void test10(){
        String[] strs = stu.split("\\s|\\W");
        for (int i = strs.length - 1; i >= 0 ; i--) {
            System.out.print(strs[i] + " ");
        }
    }
    public static void show(String[] str){
    }
    public static void main(String[] args) {
        split(" ");
        split("\\w+");
        split("\\W+");
        split("n\\W+");
    }

    @Test
    public void test08(){
        System.out.println(knights.replaceAll("[aeiou]", "_"));
    }

    @Test
    public void test06(){
        split("[the]\\s[you]");
    }

    @Test
    public void test07(){
        split("the|you");
    }

    @Test
    public void test01(){
        split("$ery,");
        System.out.println(knights.matches("$ery,"));
    }

    @Test
    public void test02(){
        String str = "abc123ssd";
        str.matches("[0-9]");
    }

    @Test
    public void test03(){
        String qq = "33333";
        System.out.println(qq.matches("[1-9][0-9]{4,12}"));

        System.out.format("%1$%2$%2$", "aaaa", "bbbb");
    }

    @Test
    public void test05(){
        String str = " SADdw";
        System.out.println(str.matches("[A-Z]\\w+"));
    }
}

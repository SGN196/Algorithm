package ThinkingInJava.test.day1_10;

/**
 * @author SGN196
 * @date 2019/1/10 12:20
 */

public class Replacing {
    static String s = "Then,when you have hound the shrubbery, you must cut down the mightiest tree in the forest.. with... a herring!";;

    public static void main(String[] args) {
        System.out.println(s.replaceFirst("f\\w+", "located"));
        System.out.println("--------------------");
        System.out.println(s.replaceAll("shrubbery|tree|herring", "banana"));
    }
}

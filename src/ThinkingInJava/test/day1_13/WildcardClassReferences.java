package ThinkingInJava.test.day1_13;

/**
 * @author SGN196
 * @date 2019/1/13 11:52
 */

public class WildcardClassReferences {
    public static void main(String[] args) {
        Class<? extends Number> clazz = int.class;
        clazz = Double.class;
        System.out.println(clazz);

    }
}

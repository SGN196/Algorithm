package ThinkingInJava.typeinfo;

/**
 * @author SGN196
 * @date 2019/1/12 22:20
 */

public class E10_PrimitiveOrTrue {
    public static void main(String[] args) {
        char[] ac = "hello owrld".toCharArray();
        System.out.println(ac.getClass());
        System.out.println(ac.getClass().getSuperclass());
        System.out.println(int.class);
        System.out.println(Integer.class);
        System.out.println(Integer.TYPE);
    }
}

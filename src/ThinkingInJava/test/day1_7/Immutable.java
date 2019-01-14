package ThinkingInJava.test.day1_7;

/**
 * @author SGN196
 * @date 2019/1/8 11:54
 */

public class Immutable {
    public static String upcase(){
        return null;
    }

    public static void main(String[] args) {
        String q = "howdy";
        String qq = q.toUpperCase();
        System.out.println(qq);
        String p = "howdy";
        System.out.println(q== p);
        q = "aaa";
        System.out.println(p);
    }

}

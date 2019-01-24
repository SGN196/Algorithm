package ThinkingInJava.test.day15_1_18;

/**
 * @author SGN196
 * @date 2019/1/17 18:27
 */

public class Holder3<T> {
    private T a;
    public Holder3(T a){ this.a = a;}


    public static void main(String[] args) {
        Holder3<String> a = new Holder3<String>("sss");
    }
}

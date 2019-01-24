package ThinkingInJava.test.day15_1_18;

/**
 * @author SGN196
 * @date 2019/1/18 16:13
 */

public class GenericMethods {
    public <T> void f(T tt){
        System.out.println(tt.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods gg = new GenericMethods();
        gg.f("11");
        gg.f(11);
        gg.f(true);
        gg.f(1.11);
        gg.f('1');
        gg.f(1.11F);
        gg.f(new GenericMethods());

    }
}

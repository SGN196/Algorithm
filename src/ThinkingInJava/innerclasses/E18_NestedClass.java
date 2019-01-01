package ThinkingInJava.innerclasses;

/**
 * @author SGN196
 * @date 2018/12/27 20:52
 */

public class E18_NestedClass {
    static class Nested{
        void f(){
            System.out.println("Nested.f()");
        }
    }

    public static void main(String[] args) {
        Nested n = new Nested();
        n.f();
    }
}
class Other {
    void f(){
        E18_NestedClass.Nested ne = new E18_NestedClass.Nested();
    }
}
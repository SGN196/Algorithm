package ThinkingInJava.innerclasses;

/**
 * @author SGN196
 * @date 2018/12/28 0:21
 */

interface I{
    void f();
    void g();
    int x = 42;
    class Nested{
        private int i = 100;
        static void call(I impl){
            System.out.println("Nested.call()");
            impl.f();
            System.out.println("Nested.call()");
            impl.g();

        }
    }
}

class a{
    private int x = 20;
    {
        System.out.println("a init()");
    }
    class b{
        {
            System.out.println(x);
        }
    }
}

public class E21_InterfaceWithNested2 {
    public static void main(String[] args) {
        I impl = new I() {
            public void f(){
                System.out.println("I.f()");
            }
            public void g(){
                System.out.println("I.g()");
            }
        };
        I.Nested.call(impl);
//        System.out.println(impl.i);
        a.b xx = new a().new b();
    }



}

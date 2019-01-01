package ThinkingInJava.innerclasses;

/**
 * @author SGN196
 * @date 2018/12/28 0:15
 */
interface WithNested{
    class Nested{
        int i;
        public Nested(int i){ this.i = i;}
        void f() {
            System.out.println("Nested.f()");
        }

        public static void main(String[] args) {
            new Nested(5).f();

        }
    }
}

class B2 implements WithNested{

}
public class E20_InterfaceWithNested {
    public static void main(String[] args) {
        B2 b = new B2();
        WithNested.Nested ne = new WithNested.Nested(5);
        ne.f();
    }

}

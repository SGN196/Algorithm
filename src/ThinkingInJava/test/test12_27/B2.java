package ThinkingInJava.test.test12_27;

/**
 * @author SGN196
 * @date 2018/12/27 23:30
 */


interface WithNested{
    class Nested{
        int i;
        public Nested(int i){ this.i = i;}
        void f() {
            System.out.println("Nested.f()");
        }
    }
}

public class B2 implements WithNested{



}

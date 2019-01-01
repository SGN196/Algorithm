package ThinkingInJava.test.test12_27;

/**
 * @author SGN196
 * @date 2018/12/27 21:24
 */

public class TestBad {
    public void f(){
        System.out.println("TestBad.f()");
    }
    public static  class Tester{
        public static void main(String[] args) {
            TestBad t = new TestBad();
            t.f();
        }
    }
}

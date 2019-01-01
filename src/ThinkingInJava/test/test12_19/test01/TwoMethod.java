package ThinkingInJava.test.test12_19.test01;

/**
 * @author SGN196
 * @date 2018/12/19 11:05
 */

class A{
    public void method01(){
        System.out.println("a.method01()");
        method02();
    }

    public void method02(){

        System.out.println("a.method02()");

    }

}
class B extends A{
    public void  method02(){
        System.out.println("b.method02()");
    }
}


public class TwoMethod {
    public static void main(String[] args) {
        A a = new B();
        a.method01();
    }



}

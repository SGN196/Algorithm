package ThinkingInJava.test.test12_27;

/**
 * @author SGN196
 * @date 2018/12/27 19:42
 */

abstract  class Base{
    public Base(int i){
        System.out.println("base constructor, i = " + i);
    }
    public abstract void f();
}
public class AnonymousConstructor {
    public static Base getBase(int num){
        return new Base(num){
            {
                System.out.println("base init()");
            }
            public  void f(){
                System.out.println("base.f()");
            }
        };
    }

    public static void main(String[] args) {
        Base base  = getBase(20);
        base.f();
    }
}

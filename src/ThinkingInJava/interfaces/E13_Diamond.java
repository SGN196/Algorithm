package ThinkingInJava.interfaces;

/**
 * @author SGN196
 * @date 2018/12/20 23:45
 */


interface BaseInterface{
    void f();
}

interface IntermediateInterface1 extends BaseInterface{

}
interface IntermediateInterface2 extends BaseInterface{

}
interface  CombinedInterface extends  IntermediateInterface1, IntermediateInterface2{

}
class CombinedImpl implements CombinedInterface{
    public void f(){
        System.out.println("CombinedImpl.f()");
    }
}

public class E13_Diamond {
    public static void main(String[] args) {
        new CombinedImpl().f();
    }

}

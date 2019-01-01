package ThinkingInJava.test.day12_28;

/**
 * @author SGN196
 * @date 2018/12/28 10:24
 */


interface Incrementable{
    void increment();
}

class Callee1 implements Incrementable{
    private int i = 0;

    @Override
    public void increment() {
        i++;
        System.out.println(i);
    }
}

class MyIncrement{
    public void increment(){
        System.out.println("MyIncrement.increment();");
    }
    static void f(MyIncrement mi){
        mi.increment();
    }
}


class Callee2 extends  MyIncrement{
    private int i = 0;
    public void increment(){
        super.increment();
        i++;
        System.out.println("Callee2.increment, i = " + i);
    }
    private class Closure implements Incrementable{
        public void  increment(){
            System.out.println("Closure.increment()");
            Callee2.this.increment();
        }
    }
    Incrementable getCallbackReference(){
        return new Closure();
    }
}
class Caller{
    private Incrementable callbackReference;
    Caller(Incrementable cbh){
        callbackReference = cbh;
    }
    void go(){
        callbackReference.increment();
    }
}
public class Callbacks {
    public static void main(String[] args) {
        Callee1 c1 = new Callee1();
        Callee2 c2 = new Callee2();
        MyIncrement.f(c2);

        Incrementable i1 = c2.getCallbackReference();
        i1.increment();
    }
}

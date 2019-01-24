package ThinkingInJava.test.day1_16;

/**
 * @author SGN196
 * @date 2019/1/16 22:12
 */


interface Interface{
    void doSomething();
    void somethingElse(String arg);
}

class RealObject implements Interface{
    @Override
    public void doSomething() {
        System.out.println("RealObject.dosomething()");
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("RealObject.somethingelse() + " + arg);
    }
}
class SimpleProxy implements Interface{
    private Interface proxied;
    public SimpleProxy(Interface proxied){
        this.proxied = proxied;
    }

    @Override
    public void doSomething() {
        System.out.println("SimpleProxy.dosomething()");
        proxied.doSomething();
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("SimpleProxy.somethingElse " + arg);
        proxied.somethingElse(arg);

    }
}

public class SimpleProxyDemo{
    public static void consumer(Interface iface){
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        consumer(new RealObject());
        System.out.println("-------------");
        consumer(new SimpleProxy(new RealObject()));
    }
}

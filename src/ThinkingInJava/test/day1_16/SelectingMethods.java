package ThinkingInJava.test.day1_16;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author SGN196
 * @date 2019/1/17 0:08
 */

class MethodSelector implements InvocationHandler {
    private Object proxied;
    public MethodSelector(Object proxied){
        this.proxied = proxied;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().equals("interesting")){
            System.out.println("Proxy detected the interesting method");
        }
        return method.invoke(proxied, args);
    }
}
interface SomeMethods{
    void boring1();
    void boring2();
    void interesting(String arg);
    void boring3();
}
class Implementation implements SomeMethods{
    public void boring1(){
        System.out.println("Implementation.boring1");
    }

    @Override
    public void boring2() {
        System.out.println("Implementation.boring2");
    }

    @Override
    public void interesting(String arg) {
        System.out.println("interesting " + arg);
    }

    @Override
    public void boring3() {
        System.out.println("Implementation.boring3");
    }
}



public class SelectingMethods {
    public static void main(String[] args) {
        SomeMethods proxy = (SomeMethods) Proxy.newProxyInstance(Implementation.class.getClassLoader(), new Class[]{SomeMethods.class},
                new MethodSelector(new Implementation()));
        proxy.boring1();
        proxy.boring2();
        proxy.boring3();
        proxy.interesting("fucking");
    }
    @Test
    public void test01(){
        System.out.println(System.nanoTime());
        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());
    }
}

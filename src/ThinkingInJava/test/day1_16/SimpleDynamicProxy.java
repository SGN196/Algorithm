package ThinkingInJava.test.day1_16;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author SGN196
 * @date 2019/1/16 22:41
 */

class DynamicProxyHandler implements InvocationHandler {
    private Object proxied;
    public DynamicProxyHandler(Object proxied){
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("**** proxy: " + proxy.getClass() + ", method: " + method + ",args : " + args);
        if(args != null){
            for(Object arg : args){
                System.out.println(" " + args);
            }
        }
        System.out.println("**************************");
        System.out.println( "  " + method + "---------------------" + args);
        System.out.println("**************************");
        return method.invoke(proxied, args);
    }
}

public class SimpleDynamicProxy{
    public static void consumer(Interface iface){
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        RealObject real = new RealObject();
        consumer(real);
        System.out.println("-----------------");

        Interface proxy = (Interface) Proxy.newProxyInstance(
          Interface.class.getClassLoader(), new Class[]{Interface.class}, new DynamicProxyHandler(real)  );
        consumer(proxy);
        System.err.println(proxy.getClass().getSimpleName());

        System.out.println("-------------------");
        System.out.println((new Class[]{Interface.class}).length);


    }
    @Test
    public void test01(){
        int[] a = new int[]{111,11};
        for(int i : a){
            System.out.println(i);
        }
    }
}

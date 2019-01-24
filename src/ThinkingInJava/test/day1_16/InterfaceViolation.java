package ThinkingInJava.test.day1_16;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @author SGN196
 * @date 2019/1/17 17:42
 */

interface A{
    void f();
}
class B implements A{
    public void f(){
        System.out.println("B.f()");
    }

    public void g(){

    }
}

public class InterfaceViolation {
    public static void main(String[] args) {
        A a = new B();
        a.f();

        System.out.println(a.getClass().getName());
        if(a instanceof B){
            System.out.println("aaaaaaaaaa");
        }
    }
    @Test
    public void test01(){
        ArrayList<A> arrayList = new ArrayList<A>();
        arrayList.add(new B());

    }
}

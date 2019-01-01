package ThinkingInJava.innerclasses;

/**
 * @author SGN196
 * @date 2018/12/28 9:58
 */

interface U{
    void f();
    void g();
    void h();
}

class A{
    public U getU(){
        return new U() {
            @Override
            public void f() {
                System.out.println("A.f()");
            }

            @Override
            public void g() {
                System.out.println("A.g()");
            }

            @Override
            public void h() {
                System.out.println("A.h()");
            }
        };
    }
}
class B{
    U[] ua;
    public B(int size){
        ua = new U[size];
    }
    public boolean add(U elem){
        for (int i = 0; i < ua.length; i++) {
            if(ua[i] == null){
                ua[i] = elem;
                return true;
            }

        }
        return true;
    }
}
public class E23_UAB {

}

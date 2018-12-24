package ThinkingInJava.interfaces;

/**
 * @author SGN196
 * @date 2018/12/21 0:46
 */

interface Interface1{
    void f1();
    void g1();
}
interface Interface2{
    void f2();
    void g2();
}
interface Interface3{
    void f3();
    void g3();
}
interface Multiple extends Interface1, Interface2, Interface3{
    void h();
}
class Concrete{
    String s;
    public Concrete(String s){
        this.s = s;
    }
}
class All extends Concrete implements Multiple{
    All(){
        super("ALL");
    }

    @Override
    public void f1() {
        System.out.println("all.f1");
    }

    @Override
    public void g1() {
        System.out.println("all.g1");
    }

    @Override
    public void f2() {
        System.out.println("all.f2");
    }

    @Override
    public void g2() {
        System.out.println("all.g2");
    }

    @Override
    public void f3() {
        System.out.println("all.f3");
    }

    @Override
    public void g3() {
        System.out.println("all.g3");
    }

    @Override
    public void h() {
        System.out.println("all.h");
    }
}

public class E14_InterfaceInheritance {

}

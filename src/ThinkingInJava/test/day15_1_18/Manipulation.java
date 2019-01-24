package ThinkingInJava.test.day15_1_18;

/**
 * @author SGN196
 * @date 2019/1/18 21:03
 */

class HasF{
    public void f(){
        System.out.println("HasF.f()");
    }
}
class Manipulator<T extends HasF>{
    private T obj;
    public Manipulator(T t){
        obj = t;
    }
    public void manipulate(){
        obj.f();
    }

}

public class Manipulation {
    public static void main(String[] args) {
        HasF h = new HasF();
        Manipulator m = new Manipulator(h);
        m.manipulate();
    }
}

package ThinkingInJava.innerclasses;

/**
 * @author SGN196
 * @date 2018/12/22 16:31
 */
class Outer3{
    class Inner{
        {
            System.out.println("Inner created");
        }
    }
}

public class E05_InstanceOfInner {
    public static void main(String[] args) {
        Outer3 o = new Outer3();
        Outer3.Inner i = o.new Inner();
    }
}

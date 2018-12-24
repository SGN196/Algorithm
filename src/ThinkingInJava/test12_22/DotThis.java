package ThinkingInJava.test12_22;

/**
 * @author SGN196
 * @date 2018/12/22 15:38
 */

public class DotThis {
    void f(){
        System.out.println("DotThis.f()");
    }
    public class Inner{

        public DotThis outer(){
            return DotThis.this;
        }
    }
    public Inner inner(){
        return new Inner();
    }
    public static void main(String[] args) {
        DotThis dt = new DotThis();
        DotThis.Inner i = dt.inner();
        i.outer().inner().outer().inner().outer().inner().outer().f();
    }
}

package ThinkingInJava.test.test12_19.test01;

/**
 * @author SGN196
 * @date 2018/12/19 11:25
 */

public class PrivateOverride {
    private void f() {
        System.out.println("private f()");
    }


    public static void main(String[] args) {
        PrivateOverride po = new Derived();
        po.f();
    }
}


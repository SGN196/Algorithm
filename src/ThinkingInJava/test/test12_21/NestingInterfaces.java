package ThinkingInJava.test.test12_21;

/**
 * @author SGN196
 * @date 2018/12/21 11:43
 */

class A{
    private interface D{
        void f();
    }
    private class DImp implements D{
        public void f(){
            System.out.println("dimp1");
        }
    }
    public class DImp2 implements D{
        public void f(){
            System.out.println("dimp2");
        }
    }
    public D getD(){
        return new DImp2();
    }
}



public class NestingInterfaces {
    public static void main(String[] args) {
        A a = new A();
        A.DImp2 c = (A.DImp2)a.getD();
        c.f();
    }
}

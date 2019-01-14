package ThinkingInJava.test.day1_6;

/**
 * @author SGN196
 * @date 2019/1/6 18:19
 */

class SimpleException extends Exception{

}
public class InheritingExceptions{
    public void f() throws SimpleException{
        System.out.println("inheriting.f()");
        throw new SimpleException();
    }

    public static void main(String[] args) {
        try {
            new InheritingExceptions().f();
        } catch (SimpleException e) {
//            e.printStackTrace();
            System.err.println("catch it");
        }
    }
}

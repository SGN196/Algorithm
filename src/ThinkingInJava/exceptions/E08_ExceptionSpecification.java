package ThinkingInJava.exceptions;

/**
 * @author SGN196
 * @date 2019/1/8 10:49
 */

class Thrower{
    public void f(){

    }
    public void g() throws MyException{
        throw new MyException("Inside g()");
    }
}

public class E08_ExceptionSpecification {
    public static void main(String[] args) {
        Thrower t = new Thrower();
        try {
            t.g();
        } catch (MyException e) {
            System.out.println(e.getMessage());
            System.out.println("--------------------");
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
        }

    }
}

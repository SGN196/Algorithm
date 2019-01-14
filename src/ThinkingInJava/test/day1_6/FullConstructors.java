package ThinkingInJava.test.day1_6;

import java.io.IOException;

/**
 * @author SGN196
 * @date 2019/1/6 22:00
 */


class MyException extends Exception{
    public MyException(){

    }
    public MyException(String msg){
        super(msg);
    }
}
public class FullConstructors {
    public static void f() throws MyException{
        System.out.println("fullConstructors.f()");
        throw new MyException();
    }
    public static void g() throws MyException{
        System.out.println("fullConstructors.g()");
        throw new MyException("oooooooooooooooooooo");
    }

    public static void main(String[] args) {
//        try {
//            g();
//        } catch (MyException e) {
//            e.printStackTrace(System.out);
//        }
        System.out.println("1111111111111111111");
        System.err.println("222222222222222222");
        char[] c = new char[1024];
        int b;
        try {
            while((b = System.in.read()) != '\n'){
                System.out.print((char)b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

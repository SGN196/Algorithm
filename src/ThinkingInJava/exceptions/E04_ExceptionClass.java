package ThinkingInJava.exceptions;

/**
 * @author SGN196
 * @date 2019/1/8 9:12
 */

class MyException extends Exception{
    String msg;
    public MyException(String msg){
        this.msg = msg;
    }
    public void printMsg(){
        System.out.println("msg = " + msg);
    }
}

class MyException2 extends Exception{
    public MyException2(String s){
        super(s);
    }
}
public class E04_ExceptionClass {
    public static void main(String[] args) {
        try {
            throw new MyException("你秀尼玛");
        } catch (MyException e) {
            e.printMsg();
        }
        try{
            throw new MyException2("尼玛死了");
        }catch (MyException2 e){
            e.printStackTrace();
        }
    }






}

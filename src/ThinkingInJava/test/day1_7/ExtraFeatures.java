package ThinkingInJava.test.day1_7;

/**
 * @author SGN196
 * @date 2019/1/7 23:56
 */


class MyException2 extends Exception{
    private int x;
    public MyException2(){}
    public MyException2(String msg){ super(msg);}
    public MyException2(String msg, int x){
        super(msg);
        this.x = x;
    }
    public int val(){
        return x;
    }
    public String getMessage(){
        return "Detail Message: "+ x + " " + super.getMessage();
//        return "abcdefg";
    }
}

public class ExtraFeatures {

    public static void f() throws MyException2{
        System.out.println("f(----------)");
        throw new MyException2();

    }
    public static void g() throws MyException2{
        System.out.println("g(-------------)");
        throw new MyException2("你秀尼玛呢");
    }
    public static void main(String[] args) {
        try {
            f();
        } catch (MyException2 myException2) {
            myException2.printStackTrace(System.out);
        }
        try{
            g();
        }catch (MyException2 myException2){
            myException2.printStackTrace();
        }
    }
}

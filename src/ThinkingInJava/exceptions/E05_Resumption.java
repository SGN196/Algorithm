package ThinkingInJava.exceptions;

/**
 * @author SGN196
 * @date 2019/1/8 9:22
 */



class ResumerException extends  Exception{

}
class Resumer{
    static int count = 5;
    static void f() throws ResumerException{
        if (--count > 0){
            throw new ResumerException();
        }else {
            System.out.println("bull shit");
        }
    }
}
public class E05_Resumption {
    public static void main(String[] args) {
        while(Resumer.count > 0) {
            try {
                Resumer.f();
            } catch (ResumerException e) {
                e.printStackTrace();
            }
        }
    }
}

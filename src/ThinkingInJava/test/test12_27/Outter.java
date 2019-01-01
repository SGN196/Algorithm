package ThinkingInJava.test.test12_27;

/**
 * @author SGN196
 * @date 2018/12/27 20:04
 */

interface Inner{
    void f();
}
public class Outter {
    public Inner destination(final int x){
        return new Inner(){
            public void f(){
                System.out.println(x);
            }
        };
    }
    public static void main(String[] argv){
        Outter outter = new Outter();
        Inner inner = outter.destination(5);
        inner.f();
    }
}
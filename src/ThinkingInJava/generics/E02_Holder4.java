package ThinkingInJava.generics;

/**
 * @author SGN196
 * @date 2019/1/17 20:15
 */

class Holder4<T>{
    private T a, b, c;
    public Holder4(T a, T b, T c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Holder4{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }

    public T getB() {
        return b;
    }

    public void setB(T b) {
        this.b = b;
    }

    public T getC() {
        return c;
    }

    public void setC(T c) {
        this.c = c;
    }
}

public class E02_Holder4 {
    public static void main(String[] args) {
        Holder4<Integer> holder4 = new Holder4<Integer>(1,2,3);
        System.out.println(holder4);
    }
}

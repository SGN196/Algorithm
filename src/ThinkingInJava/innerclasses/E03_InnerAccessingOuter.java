package ThinkingInJava.innerclasses;

/**
 * @author SGN196
 * @date 2018/12/22 15:28
 */

class Outer2{
    private String sss;
    public Outer2(String data){
        sss = data;
    }
    class Inner{
        {
            System.out.println("Inner created");
        }
        public void toString2(){
            System.out.println("sss = " + sss);
        }
    }
    Inner getInner(){
        return new Inner();
    }
}

public class E03_InnerAccessingOuter {
    public static void main(String[] args) {
        Outer2 o = new Outer2("hello world");
        Outer2.Inner i = o.getInner();
        i.toString2();
    }
}

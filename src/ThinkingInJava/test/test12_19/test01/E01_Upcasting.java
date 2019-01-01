package ThinkingInJava.test.test12_19.test01;

/**
 * @author SGN196
 * @date 2018/12/19 10:06
 */

public class E01_Upcasting {
    public static void ride(Cycle c){
        System.out.println("aaaaaaaaa");
    }

    public static void main(String[] args) {
        ride(new Bicycle());
        ride(new Unicycle());
    }
}

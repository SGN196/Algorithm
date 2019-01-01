package ThinkingInJava.test.test12_27;

/**
 * @author SGN196
 * @date 2018/12/27 18:50
 */

class Wrapping{
    private int i;
    public Wrapping(int x){
        i = x;
    }
    public int value(){
        return i;
    }
    String name;
}
public class Parcel9 {
    public Destination destination(String dest){
        return new Destination() {
            private String label = dest;

            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
//        Wrapping wrapping = p.warpping("helloworld");
//        System.out.println(wrapping.value());

        Destination d = p.destination("hello world");
        System.out.println(d.readLabel());
    }
}























package ThinkingInJava.test.test12_27;

/**
 * @author SGN196
 * @date 2018/12/27 18:32
 */
interface Destination{
    String readLabel();
}
interface Contents{
    int value();
}
public class Parcel7 {
    public Contents contents(){
        return new Contents(){
            private int i = 11;
            public int value(){
                return i;
            }
        };

    }

    public static void main(String[] args) {
        Parcel7 p = new Parcel7();
        Contents c = p.contents();
        System.out.println(c.value());
    }
}

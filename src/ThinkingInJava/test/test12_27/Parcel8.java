package ThinkingInJava.test.test12_27;

/**
 * @author SGN196
 * @date 2018/12/27 19:52
 */

public class Parcel8 {
    public Wrapping wrappping(int x){
        return new Wrapping(x){
            public int value(){
                return super.value() * 47;
            }
        };
    }
}

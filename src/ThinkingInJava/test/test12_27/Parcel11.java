package ThinkingInJava.test.test12_27;

import java.lang.reflect.ParameterizedType;

/**
 * @author SGN196
 * @date 2018/12/27 20:33
 */

public class Parcel11 {

    private static class ParcelContents implements Contents{
        private int i = 11;
        @Override
        public int value() {
            return i;
        }
        {
            System.out.println("ParcelContents.init()");
        }
    }
    protected static class ParcelDestination implements  Destination{
        private String label;
        private ParcelDestination(String whereTo){
            label = whereTo;
        }

        @Override
        public String readLabel() {
            return label;
        }
    }



    public static Contents contents() {
        return new ParcelContents();
    }
    public static Destination destination(String s){
        return new ParcelDestination(s);
    }

    public static void main(String[] args) {
        Contents c = contents();
        Destination d = destination("hello world");
    }

}

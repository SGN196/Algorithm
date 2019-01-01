package ThinkingInJava.test.test12_27;

/**
 * @author SGN196
 * @date 2018/12/27 19:55
 */

public class Parcel10 {
    public Destination destination(String dest, float price){
        return new Destination(){
            private int cost;
            {
                cost = Math.round(price);
                if(cost > 100){
                    System.out.println("cost > 100");
                }
            }
            private String label = dest;
            public String readLabel(){
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel10 p = new Parcel10();
        Destination d = p.destination("hello", 1995.5F);
        System.out.println(d.readLabel());
    }
}

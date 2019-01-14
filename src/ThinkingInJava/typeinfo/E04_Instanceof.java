package ThinkingInJava.typeinfo;

/**
 * @author SGN196
 * @date 2019/1/12 0:29
 */

public class E04_Instanceof {
    public static void main(String[] args) {
        Shape s = new Circle();
        Circle c = null;
        if(s instanceof Circle){
            c = (Circle)s;
        }
    }
}

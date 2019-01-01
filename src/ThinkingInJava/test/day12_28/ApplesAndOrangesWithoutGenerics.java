package ThinkingInJava.test.day12_28;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author SGN196
 * @date 2018/12/28 15:26
 */


class Apple{
    private static long counter;
    private final long id = counter++;
    public long id(){
        return id;
    }
}
class Orange{}

public class ApplesAndOrangesWithoutGenerics {
//    @SuppressWarnings("unchecked")

    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
//        apples.add(new Orange());
//        for (int i = 0; i < apples.size(); i++) {
//            ((Apple)apples.get(i)).id();
//
//        }
        System.out.println(apples.get(0).getClass().getSimpleName());
        Iterator i = apples.iterator();
        Object obj = i.next();
        System.out.println(obj.getClass().getSimpleName());
        Apple a = apples.get(1);
    }
}

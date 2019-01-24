package ThinkingInJava.test.day15_1_18;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SGN196
 * @date 2019/1/18 17:17
 */

public class GenericVarargs {
    public static <T> List<T> makeList(T... args){
        List<T> list = new ArrayList<T>();
        for(T t : args){
            list.add(t);
        }
        return list;
    }
    public static void main(String[] args) {
        List<String> ls = makeList("A");
        System.out.println(ls);
        ls = makeList("ABCDEFGHIJKLMNOPQRSTUVWXYZ".split(""));
        System.out.println(ls);
    }
}

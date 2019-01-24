package ThinkingInJava.test.day15_1_18;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author SGN196
 * @date 2019/1/18 17:09
 */

public class New {
    public static <K,V> Map<K, V> map(){
        return new HashMap<K, V>();

    }
    public static void f(Map<Integer,List<? extends Number>> map){
        System.out.println(map.getClass().getName());
        Arrays.asList();

    }

    public static void main(String[] args) {
        f(New.map());
    }
}

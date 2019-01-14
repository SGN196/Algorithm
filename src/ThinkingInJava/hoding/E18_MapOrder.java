package ThinkingInJava.hoding;

import net.mindview.util.Countries;

import java.util.*;

/**
 * @author SGN196
 * @date 2019/1/4 20:19
 */

public class E18_MapOrder {
    public static void main(String[] args) {
        Map<String, String> m1 = new HashMap<String, String>(Countries.capitals(25));
        String[] keys = m1.keySet().toArray(new String[0]);
        Arrays.sort(keys);
        for(String str : keys){
            System.out.print(str + ", ");
        }
        System.out.println();
        Set<String> set = new HashSet<>(Arrays.asList(keys));
        System.out.println(set);
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList(keys));
        System.out.println(linkedHashSet);
//        for(String str : keys){
//            System.out.println(str);
//        }
//        System.out.println("---------------------------");
//        Arrays.sort(keys);
//        LinkedHashMap<String, String> map = new LinkedHashMap<>();
//
//        for(String str : keys){
//            System.out.println(str);
//            map.put(str, m1.get(str));
//        }
//        System.out.println(map);

//        System.out.println(m1);
    }
}

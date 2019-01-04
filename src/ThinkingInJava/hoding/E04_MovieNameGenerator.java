package ThinkingInJava.hoding;

import java.util.*;

/**
 * @author SGN196
 * @date 2019/1/2 19:15
 */


class MovieNameGenerator {
    String[] characters = {"A", "B","C", "D", "E","F","G","H","I","j"};
    int next = 0;
    public String next(){
        String r = characters[next];
        next = (next + 1) % characters.length;
        return r;
    }
}

public class E04_MovieNameGenerator {
    private static final MovieNameGenerator mng = new MovieNameGenerator();
    public static String[] fill(String[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = mng.next();
        }
        return array;
    }
    public static Collection<String> fill(Collection<String> collection){
        for (int i = 0; i < 5; i++) {
            collection.add(mng.next());
        }
        return collection;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fill(new String[5])));
        System.out.println(fill(new ArrayList<String>()));
        System.out.println(fill(new LinkedList<String>()));
        System.out.println(fill(new HashSet<String>()));
        System.out.println(fill(new LinkedHashSet<String>()));
        System.out.println(fill(new TreeSet<String>()));
    }
}

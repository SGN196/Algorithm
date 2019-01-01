package ThinkingInJava.hoding;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * @author SGN196
 * @date 2018/12/28 16:40
 */

public class E02_SimpleCollection2 {
    public static void main(String[] args) {
        Collection<Integer>c = new HashSet<Integer>();
        for (int i = 0; i < 10; i++) {
            c.add(i);
        }
        for (int i = 0; i < 15; i++) {
            c.add(i);
        }
        for(Integer i : c)
            System.out.println(i + ", ");
    }
}

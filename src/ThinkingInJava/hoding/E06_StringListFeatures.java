package ThinkingInJava.hoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author SGN196
 * @date 2019/1/4 13:30
 */

public class E06_StringListFeatures {
    static Random rand = new Random(47);

    public static void main(String[] args) {
        List<String> strs = new ArrayList<String>(Arrays.asList("A","B","C", "D", "E", "F", "G"));

        List<String> strs1 = strs.subList(2,5);
        strs.remove(0);
        System.out.println(strs);

    }



}

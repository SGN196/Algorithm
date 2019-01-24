package ThinkingInJava.generics;

import ThinkingInJava.test.day15_1_18.RandomList;

/**
 * @author SGN196
 * @date 2019/1/18 0:50
 */

public class E06_RandomListTest {
    public static void dump(RandomList<?> aa){
        for (int i = 0; i < 20; i++) {
            System.out.print(aa.select());

        }
        System.out.println();

    }

    public static void main(String[] args) {
        RandomList<String> strs = new RandomList<String>();
        for(String s : ("hello world".split(" "))){
            strs.add(s);
        }
        dump(strs);
        RandomList<Integer> fir = new RandomList<Integer>();
        int i = 10;
        for (int j = 0; j < 10; j++) {
            fir.add(i++);
        }
        dump(fir);
    }

}

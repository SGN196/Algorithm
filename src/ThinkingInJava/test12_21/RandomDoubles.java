package ThinkingInJava.test12_21;

import java.util.Random;

/**
 * @author SGN196
 * @date 2018/12/21 10:59
 */

public class RandomDoubles {
    private static Random rand = new Random(47);
    public double next() {
        return rand.nextDouble();
    }

    public static void main(String[] args) {
        RandomDoubles rd = new RandomDoubles();
        for (int i = 0; i < 7; i++) {
            System.out.println(rd.next() + " ");

        }
    }

}

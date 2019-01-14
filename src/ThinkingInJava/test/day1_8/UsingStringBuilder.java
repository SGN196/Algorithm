package ThinkingInJava.test.day1_8;

import java.util.Random;

/**
 * @author SGN196
 * @date 2019/1/8 15:19
 */

public class UsingStringBuilder {
    public static Random rand = new Random(47);
    public String toString(){
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < 25; i++) {
            result.append(rand.nextInt(100));
            result.append(". ");
        }
        result.delete(result.length() - 2, result.length());
        result.append("]");
        return result.toString();
    }

    public static void main(String[] args) {
        UsingStringBuilder usb = new UsingStringBuilder();
        System.out.println(usb);
    }
}

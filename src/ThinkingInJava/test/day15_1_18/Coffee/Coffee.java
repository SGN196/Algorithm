package ThinkingInJava.test.day15_1_18.Coffee;

/**
 * @author SGN196
 * @date 2019/1/18 11:14
 */

public class Coffee {
    private static long counter = 0;
    private final long id = counter++;

    @Override
    public String toString() {
        return "Coffee{" + getClass().getSimpleName() +
                "：id=" + id +
                '}';
    }
}

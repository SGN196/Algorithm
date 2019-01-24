package ThinkingInJava.test.day1_16;

import java.util.List;

/**
 * @author SGN196
 * @date 2019/1/17 17:38
 */

public interface Robot {
    String name();
    String model();
    List<Operation> operations();
    class Test{
        public static void test(Robot r) {
            if (r instanceof Null) {
            }
        }

    };

}

package ThinkingInJava.test.day21_1_19;

/**
 * @author SGN196
 * @date 2019/1/20 0:57
 */

public class MoreBasicThreads {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new LiftOff()).start();
        }

        for (int i = 0; i < 5; i++) {
            new LiftOff().run();
        }
    }
}

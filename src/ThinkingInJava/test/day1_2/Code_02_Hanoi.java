package ThinkingInJava.test.day1_2;

/**
 * @author SGN196
 * @date 2019/1/3 15:53
 */

public class Code_02_Hanoi {
    public static void process(int N, String from, String to, String help) {
        if (N == 1) {
            System.out.println(N + "Move " + from + ",to " + to);
        } else {
            process(N - 1, from, help, to);
            System.out.println("Move " + N + ",from " + from + ",to " + to);
            process(N - 1, help, to, from);
        }
    }

    public static void main(String[] args) {
            process(16 , "左", "右", "中");
    }

}

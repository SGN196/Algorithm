package ThinkingInJava.test.day15_1_18;

import ThinkingInJava.test.day15_1_18.Coffee.Generator;

/**
 * @author SGN196
 * @date 2019/1/18 16:02
 */

public class Fibonacci implements Generator<Integer> {
    private int count = 0;
    @Override
    public Integer next() {
        return fib(count++);
    }
    private int fib(int n){
        if(n < 2) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
         Fibonacci gen = new Fibonacci();
        for (int i = 0; i < 18; i++) {
            System.out.println(gen.next());
        }
    }
}

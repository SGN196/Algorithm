package ThinkingInJava.test.test12_27;

/**
 * @author SGN196
 * @date 2018/12/27 21:20
 */

public interface ClassInInterface {
    void howdy();
    class Test implements ClassInInterface{
        @Override
        public void howdy() {
            System.out.println("TEst.howdy()");
        }

        public static void main(String[] args) {
            new Test().howdy();
        }
    }
}

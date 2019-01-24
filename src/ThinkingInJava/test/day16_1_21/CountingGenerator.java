package ThinkingInJava.test.day16_1_21;

import net.mindview.util.Generator;

/**
 * @author SGN196
 * @date 2019/1/21 12:08
 */

public class CountingGenerator {
    public static class Boolean implements Generator<java.lang.Boolean>{
        private boolean value = false;
        public java.lang.Boolean next(){
            value = !value;
            return value;
        }

    }

}

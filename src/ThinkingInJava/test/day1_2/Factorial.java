package ThinkingInJava.test.day1_2;

import org.junit.Test;

/**
 * @author SGN196
 * @date 2019/1/3 15:14
 */

public class Factorial {

    public static int ff(int num){
        if(num == 1){
            return 1;
        }
        return num * ff(num - 1);
    }


    public static void main(String[] args) {
        System.out.println(ff(10));

    }
}
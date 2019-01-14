package ThinkingInJava.test.day1_11;

import org.junit.Test;

import java.util.*;

/**
 * @author SGN196
 * @date 2019/1/11 17:50
 */

public class ScannerDelimiter {
    public static void main(String[] args) {
        Scanner sc = new Scanner("12,42,78,99,43");
        sc.useDelimiter("\\s*,\\s*");
        while(sc.hasNextInt()){
            System.out.println(sc.nextInt());
        }
    }

    @Test
    public void test01(){
        int[] a = {1,2,3,4};
        String s = "ssss";
//        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(a));

    }
}

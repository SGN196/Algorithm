package ThinkingInJava.test.day1_10;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Scanner;

/**
 * @author SGN196
 * @date 2019/1/10 20:31
 */

public class SiimpleRead {
    public static BufferedReader input = new BufferedReader(new StringReader("Sir Robin of Camelot\n22 1.61803"));

    public static void main(String[] args) {
        try {
            String name = input.readLine();
            System.out.println(name);
            String numbers = input.readLine();
            System.out.println(numbers);

            String[] numArray = numbers.split(" ");
            double favorite = Double.parseDouble(numArray[1]);
            System.out.println(favorite / 2);
            System.out.println(input.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test01(){
        Scanner sc = new Scanner(input);

        String name = sc.nextLine();
        System.out.println(name);
        System.out.println(sc.nextInt());
        System.out.println(sc.nextDouble());
//        System.out.println(sc.nextInt());
        System.out.println(sc.hasNext());
        System.out.println(sc.ioException());
    }
}

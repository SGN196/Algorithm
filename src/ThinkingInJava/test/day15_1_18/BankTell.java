package ThinkingInJava.test.day15_1_18;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * @author SGN196
 * @date 2019/1/18 17:50
 */


class Customer{

}
class Teller{

}
public class BankTell {
    public static void serve(Teller t, Customer c){
        System.out.println(t + " serves " + c);
    }

    public static void main(String[] args) {
        Random rand = new Random(47);
        Queue<Customer> line = new LinkedList<Customer>();

    }
}

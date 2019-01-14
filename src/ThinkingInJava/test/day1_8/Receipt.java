package ThinkingInJava.test.day1_8;

import java.util.Formatter;

/**
 * @author SGN196
 * @date 2019/1/9 16:29
 */

public class Receipt {
    private double total = 0;
    private Formatter f = new Formatter(System.out);

    public final static int NUM = 8;

    public void printTitle(){
        f.format("%-15s %5s %10s\n", "item", "qty", "price");
        f.format("%-15s %5s %10s\n", "----", "---", "-----");
    }

    public void print(String name, int qty, double price) {
        f.format("%-15.15s %5d %10.2f\n", name, qty, price);
    }

    public void printTotal() {
        f.format("%-15s %5s %10.2f\n", "Tax", "", total * 0.06);
        f.format("%-15s %5s %10s\n", "", "", "-----");
        f.format("%-" + NUM+ "s %" + NUM + "s %" + NUM + "f\n", "Total", "", total * 1.06);

    }

    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.print("java's Magic Beans", 4, 4.25);
        System.out.println("-----------------------------");
        receipt.printTotal();
    }
}

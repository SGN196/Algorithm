package ThinkingInJava.strings;

import java.util.Scanner;

/**
 * @author SGN196
 * @date 2019/1/10 23:02
 */


class DataHolder2{
    private int i ;
    private long l;
    private float f;
    private double d;
    private String s;
    public DataHolder2(String str){
        Scanner sc = new Scanner(str);
        i = sc.nextInt();
        l = sc.nextLong();
        f = sc.nextFloat();
        d = sc.nextDouble();
        while (sc.hasNext()) {
            s = s + sc.next();
        }
    }

    @Override
    public String toString() {
        return "DataHolder2{" +
                "i=" + i +
                ", l=" + l +
                ", f=" + f +
                ", d=" + d +
                ", s='" + s + '\'' +
                '}';
    }
}

public class E20_Scanner {
    public static void main(String[] args) {
        DataHolder2 dh = new DataHolder2("1 100000000 1.1 1e55 Howdy Hi");
        System.out.println(dh);
    }
}

package ThinkingInJava.test.day1_8;

import java.io.PrintStream;
import java.util.Formatter;

/**
 * @author SGN196
 * @date 2019/1/9 13:34
 */

public class Turtle {
    private String name;
    private Formatter f;
    public Turtle(String name, Formatter f){
        this.name = name;
        this.f = f;
    }
    public void move(int x, int y){
        f.format("%s the turtle is at (%d, $d)\n", name, x, y);

    }

    public static void main(String[] args) {
        PrintStream outAlias = System.err;
        Turtle tommy = new Turtle("Tommy", new Formatter(System.out));
        Turtle terry = new Turtle("Terry", new Formatter(System.out));
        outAlias.println("aaaaaaaa");
    }
}

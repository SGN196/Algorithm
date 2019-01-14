package ThinkingInJava.typeinfo;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author SGN196
 * @date 2019/1/12 0:20
 */

abstract class Shape{
    void draw(){
        System.out.println(this + ".draw()");
    }
    abstract public String toString();
}
class Circle extends Shape{
    @Override
    public String toString() {
        return "Circle";
    }
}
class Square extends Shape{
    @Override
    public String toString() {
        return "Square";
    }
}
class Triangle extends Shape{
    @Override
    public String toString() {
        return "Triangle";
    }
}

class Rhomboid extends Shape{
    public String toString(){
        return "Rhombiod";
    }
}
public class E03_Rhomboid {
    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(new Circle(), new Square(), new Triangle(), new Rhomboid());
        for(Shape shape : shapes)
            shape.draw();
        Shape shape = new Rhomboid();
        Rhomboid r = (Rhomboid)shape;
        Circle c = (Circle)shape;
        r.draw();
    }
    @Test
    public void test(){
        System.out.println(System.currentTimeMillis());
    }
}

package ThinkingInJava.test.day1_13;

import org.junit.Test;

/**
 * @author SGN196
 * @date 2019/1/11 23:38
 */

interface HasBatteries{}
interface Waterproof{}
interface Shoots{}

class Toy{
    Toy(){}
    Toy(int i){}
}
class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots{
    FancyToy(int i){
        super(1);
    }
}
public class ToyTest {
    static void printInfo(Class cc){
        System.out.println(cc.getName());
        System.out.println(cc.isInterface());
        System.out.println(cc.getSimpleName());
        System.out.println(cc.getCanonicalName());
    }
    public class A{}
    @Test
    public void test02(){
        try {
            Class c = Class.forName("ThinkingInJava.test.day1_13.FancyToy");
            Class up = c.getSuperclass();
            Object obj = up.newInstance();
            printInfo(up);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Class c = null;
        try {
//            c = Class.forName("ThinkingInJava.test.day1_13.FancyToy");
            c = Class.forName("A");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        printInfo(c);
    }
    @Test
    public void test01(){
        Class c = null;
        try {
            c = Class.forName("ThinkingInJava.test.day1_13.FancyToy");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        for(Class face : c.getInterfaces()){
            printInfo(face);
            System.out.println("--------------------");
        }
    }
    @Test
    public void test03(){
        try {
            Class clazz = Class.forName("ThinkingInJava.test.day1_13.FancyToy");
            clazz.getDeclaredConstructor(int.class).newInstance(1);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (NoSuchMethodException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

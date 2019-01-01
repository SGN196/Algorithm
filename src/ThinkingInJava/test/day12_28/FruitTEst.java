package ThinkingInJava.test.day12_28;

import java.util.ArrayList;

/**
 * @author SGN196
 * @date 2018/12/28 15:58
 */


abstract class Fruit{

}
class FruitA extends Fruit{}
class FruitB extends Fruit{
}
class FruitC extends Fruit{}
class FruitD extends Fruit{}
interface FF{

}
class FFa implements FF{
    void show(){
        System.out.println("FFa.show()");
    }
}

public class FruitTEst {
    public static void main(String[] args) {
        ArrayList<Fruit> fruits = new ArrayList<>();
        fruits.add(new FruitA());
        System.out.println(fruits.get(0).getClass().getSimpleName());

        FF x = new FFa();
//        x.show();       //error
        ((FFa) x).show();
    }
}

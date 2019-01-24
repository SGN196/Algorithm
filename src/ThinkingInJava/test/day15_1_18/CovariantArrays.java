package ThinkingInJava.test.day15_1_18;

import java.util.Arrays;
import java.util.List;

/**
 * @author SGN196
 * @date 2019/1/19 11:23
 */

class Fruit{}
class Apple extends Fruit{

}
class Jonathan extends Apple{

}
class Orange extends Fruit{

}

public class CovariantArrays {
    public static void main(String[] args) {
        Fruit[] fruit = new Apple[10];
        fruit[0] = new Apple();
        fruit[1] = new Jonathan();
        fruit[0] = new Fruit();
        System.out.println("----");
//        ArrayList<Fruit> list = new ArrayList<Apple>();
//        list.add(new Apple());
//        System.out.println(list);

//        List<? extends Fruit> flist = new ArrayList<Apple>(new Apple());
        List<? extends Fruit> flist = Arrays.asList(new Apple());

//        flist.add(new Fruit());

    }

}

package ThinkingInJava.test12_19.test01;

/**
 * @author SGN196
 * @date 2018/12/20 10:09
 */

public class testCycle {
    public static void main(String[] args) {
        Cycle[] cycles = { new Unicycle(), new Bicycle(), new Tricycle()};
        ((Unicycle)cycles[0]).balance();
        ((Bicycle)cycles[1]).balance();
//        ((Tricycle)cycles[2]).balance();
    }
}

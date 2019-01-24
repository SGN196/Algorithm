package ThinkingInJava.test.day15_1_18;

import java.util.*;

/**
 * @author SGN196
 * @date 2019/1/18 18:00
 */


class Frob{}
class Fnorkle{}
class Quark<Q>{

}
class Particle<POSITION, MOMENTUM>{

}

public class LostInformation {
    public static void main(String[] args) {
        List<Frob> list = new ArrayList<Frob>();
        Map<Frob, Fnorkle> map = new HashMap<Frob, Fnorkle>();
        System.out.println(Arrays.toString(
                map.getClass().getTypeParameters()
        ));

        String[] a = "ABCDEFGHIJKLMN".split("");
        System.out.println(Arrays.toString(a));
    }

}

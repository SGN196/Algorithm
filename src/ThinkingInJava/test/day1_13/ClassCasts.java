package ThinkingInJava.test.day1_13;

/**
 * @author SGN196
 * @date 2019/1/13 12:55
 */



class Building{}
class House extends Building{

}

public class ClassCasts {
    public static void main(String[] args) {
        Building b = new House();
        Class<House> houseType = House.class;
        House h = houseType.cast(b);
    }
}

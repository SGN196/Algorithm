package ThinkingInJava.test.day15_1_18;

/**
 * @author SGN196
 * @date 2019/1/18 21:20
 */

class Building{}
class House extends Building{}

public class ClassTypeCapture<T> {
    Class<T> kind;
    public ClassTypeCapture(Class<T> kind){
        this.kind = kind;
    }

    public boolean f(Object args){
        return kind.isInstance(args);
    }

    public static void main(String[] args) {
        ClassTypeCapture<Building> ctt1 = new ClassTypeCapture<Building>(Building.class);
        System.out.println(Building.class.getName());
        System.out.println(ctt1.f(new Building()));
        System.out.println(ctt1.kind.isInstance(new Building()));
        System.out.println(Building.class.isInstance(new Building()));
        System.out.println(ctt1.getClass());

    }
}

package ThinkingInJava.typeinfo;

import java.lang.reflect.Constructor;

/**
 * @author SGN196
 * @date 2019/1/16 19:33
 */


class Toy{

    public String toString(){
        System.out.println("Toy is good!!!!");
        return null;
    }
    public void a(){
        System.out.println("Toy is good!!!!");
    }
}
class SuperToy extends Toy{
    int IQ;
    public SuperToy(){
        IQ = 100;
    }
    public SuperToy(int i){
        IQ = i;
    }
    public String toString(){
        System.out.println("IQ = " + IQ);
        return "i'm smarter than you";
    }

}

public class E19_ReflectionToyCreation {
    public static void main(String[] args) {
        boolean flag = false;
        try {
            Class<?> clazz = Class.forName("ThinkingInJava.typeinfo.SuperToy");
            for(Constructor<?> ctor : clazz.getConstructors()){
                Class<?>[] params = ctor.getParameterTypes();
                if(params.length == 1){
                    flag = true;
                    Toy obj = (Toy)ctor.newInstance(200);
                    obj.a();;
                    System.out.println(obj.toString());
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
        if(flag == false)
            System.out.println("Init is fall");
    }
}

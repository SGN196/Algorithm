package ThinkingInJava.test.day1_11;

/**
 * @author SGN196
 * @date 2019/1/11 22:19
 */



class Candy{
    static{
        System.out.println("Candy");
    }
}
class Gum{
    static{
        System.out.println("Gum");
    }
}
class Cookie{
    static{
        System.out.println("Cookie");
    }
}
public class SweetShop {
    public static void main(String[] args) {
        System.out.println("inside main");
        new Candy();
        System.out.println("After Candy");

        try {
            Class c = Class.forName("ThinkingInJava.test.day1_11.Gum");
            Object o = c.newInstance();
        } catch (ClassNotFoundException e) {
            System.err.println("couldn't find gum");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

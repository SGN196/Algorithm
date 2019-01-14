package ThinkingInJava.typeinfo;

/**
 * @author SGN196
 * @date 2019/1/12 22:11
 */

class ABC {

}
public class E08_RecursiveClassPrint extends ABC{
    static void printClasses(Class<?> c){
        if(c == null){
            return;
        }
        System.out.println(c.getCanonicalName());
        if(c.getSuperclass() != Object.class){
            printClasses(c.getSuperclass());

        }
    }

    public static void main(String[] args) {
        printClasses(new E08_RecursiveClassPrint().getClass());
//        System.out.println(new E08_RecursiveClassPrint().getClass().getSuperclass());
    }
}

package ThinkingInJava.test.day1_16;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

/**
 * @author SGN196
 * @date 2019/1/16 18:46
 */

public class ShowMethods {

//    private static Pattern p = Pattern.compile("\\w+\\.");
    private static Pattern p = Pattern.compile("native|final|\\w+\\.|\\s{2}");

    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("ThinkingInJava.test.day1_16.ShowMethods");
            Method[] methods = c.getMethods();
            Constructor[] ctors = c.getConstructors();
            for(Method method : methods){
               System.out.println(p.matcher(method.toString()).replaceAll(""));
//                System.out.println(method);
            }
            System.out.println("------------");
            System.out.println(ctors.length);
            for(Constructor ctor : ctors){
                System.out.println(p.matcher(ctor.toString()).replaceAll(""));
                System.out.println(ctor);

            }



        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

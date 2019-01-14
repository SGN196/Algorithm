package ThinkingInJava.test.day1_13;

/**
 * @author SGN196
 * @date 2019/1/13 12:34
 */

public class GenericToyTest {
    public static void main(String[] args) throws Exception{
        Class<FancyToy> ftClass = FancyToy.class;
        FancyToy fancyToy = ftClass.getDeclaredConstructor(int.class).newInstance(1);
        Class<? super FancyToy> up = ftClass.getSuperclass();
//        Class<Toy> up = ftClass.getSuperclass();
        Toy obj = (Toy)up.getDeclaredConstructor().newInstance();
        System.out.println(obj.getClass());

    }
}

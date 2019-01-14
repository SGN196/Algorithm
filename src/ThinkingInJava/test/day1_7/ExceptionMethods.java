package ThinkingInJava.test.day1_7;

/**
 * @author SGN196
 * @date 2019/1/8 11:47
 */

public class ExceptionMethods {
    public static void main(String[] args) {
        try{
            throw new Exception("My Exception");
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.getLocalizedMessage());
            System.out.println(e);
            e.printStackTrace();
        }
    }
}

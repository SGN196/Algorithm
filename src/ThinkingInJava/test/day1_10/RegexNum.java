package ThinkingInJava.test.day1_10;

/**
 * @author SGN196
 * @date 2019/1/10 18:23
 */

public class RegexNum {

    public static int[] getArray(int size, int value){
        int[] arr = new int[(int)(size * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * (value ));
        }
        return arr;
    }

    public static boolean check(String regex, int[] arr){
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            String s = String.valueOf(arr[i]);
            if(!s.matches(regex)){
                System.out.println(s);
                return false;
            }
        }
        return true;
    }
    public static boolean check(String regex){
        int i = 0;
        while(i < 9999999){
            int num = (int)(Integer.MAX_VALUE * Math.random());
            String s = String.valueOf(num);
            if(!s.matches(regex)){
                System.out.println(s);
                return false;
            }
            i++;
            if(i % 100000 == 0){
                System.out.println(i + " " + s);
            }
        }
        System.out.println(i);
        return true;
    }

    public static void main(String[] args) {
        String regex = "[9]^[1-9][0-9]+"; //正数
        String str = "999";
        System.out.println(str.matches(regex));
//        if(!check(regex)){
//            System.out.println("error");
//        }else
//            System.out.println("good");
    }
}

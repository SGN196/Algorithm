package ThinkingInJava.test.test12_25;

import java.util.regex.Pattern;

/**
 * @author SGN196
 * @date 2018/12/25 20:09
 */

public class RegexExample1 {
    public static void main(String[] args) {
        String content = "i am noob " + "from runoob.com.";
        String pattern = ".*runoob.*";
        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println(isMatch);
    }
    public static boolean checkQQ(String qq){
        boolean flag = true;
        if(qq.length() < 5 && qq.length() > 15){
            return false;
        }
        if(qq.startsWith("0")){
            return false;
        }
        return true;

    }

    public static void check(){
        String str = "service@xsoftlab.net";
        String regEx = "baike.*";
        Pattern pattern;
    }

}

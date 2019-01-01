package ThinkingInJava.test.test12_25;

import java.util.HashMap;

/**
 * @author SGN196
 * @date 2018/12/25 14:41
 */

public class Test01 {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("zuo", 31);
        map.put("yao", 2);
        map.put("laozhang", 46);
        System.out.println(map.get("zuo"));
    }
}

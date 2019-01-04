package ThinkingInJava.test.day1_2;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author SGN196
 * @date 2019/1/2 11:10
 * 假设全为小写字符串 b ba
 */

public class lowestLexicography {
    public static class MyComparator implements Comparator<String> {
        @Override
        public int compare(String str1, String str2) {
            char[] c1 = str1.toCharArray();
            char[] c2 = str2.toCharArray();
            long len;
            return str1.compareTo(str2);
        }
    }
    public static long m(String str1){
        char[] c = str1.toCharArray();
        long sum = 0;
        for (int i = 0; i < c.length; i++) {
            int num = c[i] - 'a';
            sum += sum + num * (Math.pow(26,(c.length - i)));
        }
        return sum;
    }
    public static String lowestString(String[] strs){
        if(strs == null || strs.length == 0){
            return "";
        }
        Arrays.sort(strs, new MyComparator());
        String res = "";
        for (int i = 0; i < strs.length; i++) {
            res += strs[i];
        }
        return res;
    }

    public static void main(String[] args) {
        String[] strs1 = { "jibw", "ji", "jp","bw","jibw", "ba", "b"};

        System.out.println(lowestString(strs1));

    }
}

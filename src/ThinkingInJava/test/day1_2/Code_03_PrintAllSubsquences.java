package ThinkingInJava.test.day1_2;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author SGN196
 * @date 2019/1/3 16:19
 */

public class Code_03_PrintAllSubsquences {
    static int num = 0;
    private static void printAllSubsquence(String str) {
        show(str, 0);
    }

    private static void show(String str, int i) {
        if(i >= str.length()){
            System.out.println(str);
            num++;
            return ;
        }
        if(i < str.length()){
            char[] chs1 = str.toCharArray();
            chs1[i] = ' ';
            String str2 = new String(chs1, 0, chs1.length);
            i++;
            show(str, i);
            show(str2,i);

        }
    }
    public static void printAll(String str, int i, char[] chs){
        if(i >= chs.length){
            System.out.println(str);
            return ;
        }
        printAll(str, i + 1, chs);
        printAll(str + String.valueOf(chs[i]), i + 1, chs);

    }
    public static void swap(char[] c, int l, int r){
        char temp = c[l];
        c[l] = c[r];
        c[r] = temp;
    }


    @Test
    public void test05(){
        String str = "abcdefghijkl";
        char[] chs = str.toCharArray();
        char[] c = Arrays.copyOf(chs, chs.length);
        chs[5] = ' ';
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }
        for (int i = 0; i < chs.length; i++) {
            System.out.print(chs[i]);
        }
    }
    public static int num1 = 0;
    public static void printAllSort(String str, char[] chs, int i) {
        if (i >= chs.length) {
            System.out.println(str);
            num1++;
            return;
        }
        for (int j = i; j < chs.length; j++) {
            char[] c = Arrays.copyOf(chs, chs.length);
            swap(c, i, j);
            printAllSort(str + String.valueOf(c[i]), c, i + 1);

        }

    }

    public static void main(String[] args) {
        String test1 = "abcdefghi";
        String test = "abc";

        printAllSort("", test1.toCharArray(), 0);
        System.out.println(num1);

//        System.out.println("---------------------");
//        printAllSubsquence(test);
//        System.out.println("num = " + num);
//        printAll("", 0, test.toCharArray());


    }


}

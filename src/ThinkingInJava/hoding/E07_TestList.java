package ThinkingInJava.hoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author SGN196
 * @date 2019/1/4 13:38
 */


class IDClass {
    private static int counter;
    private int count = counter++;

    public String toString() {
        return "IDClass " + count;
    }
}

public class E07_TestList {
    public static void main(String[] args) {
        IDClass[] idc = new IDClass[10];
        for (int i = 0; i < idc.length; i++) {
            idc[i] = new IDClass();
        }
        List<IDClass> list = new ArrayList<>(Arrays.asList(idc));
        System.out.println(list);
        List<IDClass> subSet = list.subList(list.size() / 4, list.size() / 2);
        System.out.println(subSet);
        subSet.clear();
        System.out.println(list);

    }

}

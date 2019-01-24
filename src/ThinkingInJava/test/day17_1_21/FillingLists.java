package ThinkingInJava.test.day17_1_21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author SGN196
 * @date 2019/1/21 12:42
 */

class StringAddress{
    private String s;
    public StringAddress(String s){
        this.s = s;
    }
    public String toString(){
        return super.toString() + " " + s;
    }
}

public class FillingLists {
    public static void main(String[] args) {
        List<StringAddress> list = new ArrayList<>(Collections.nCopies(4, new StringAddress("Hello")));
        System.out.println(list);
        System.out.println(list.get(1) == list.get(3));

    }
}

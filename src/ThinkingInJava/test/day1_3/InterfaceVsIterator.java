package ThinkingInJava.test.day1_3;

import java.util.Collection;
import java.util.Iterator;

/**
 * @author SGN196
 * @date 2019/1/5 0:35
 */

public class InterfaceVsIterator {
    public static void display(Iterator<Pet> it){
        while(it.hasNext()){
            Pet p = it.next();
            System.out.println(p);
        }
        System.out.println();
    }
    public static void display(Collection<Pet> pets){
        for(Pet pet : pets){
            System.out.println(pet);
        }
    }

    public static void main(String[] args) {

    }
}

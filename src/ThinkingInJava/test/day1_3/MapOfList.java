package ThinkingInJava.test.day1_3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author SGN196
 * @date 2019/1/4 17:50
 */

public class MapOfList {
    static class Pet{}
    static class Person{

    }
    static class Cat extends Pet{

    }
    static class Dog extends Pet{

    }
    static class Pig extends Pet{

    }
    public static Map<Person, List<? extends Pet>> petPeople = new HashMap<Person, List<? extends Pet>> ();


    static{
        petPeople.put(new Person(), Arrays.asList(new Cat(), new Dog(), new Pig()));
        petPeople.put(new Person(), Arrays.asList(new Pig(), new Pig(), new Pig()));
    }

    public static void show(){
        for(Person person : petPeople.keySet()){
            for(Pet pet :  petPeople.get(person)){
                System.out.println(pet);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        show();
    }
}

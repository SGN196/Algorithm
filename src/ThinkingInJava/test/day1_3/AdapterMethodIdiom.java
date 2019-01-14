package ThinkingInJava.test.day1_3;

import java.util.Iterator;

/**
 * @author SGN196
 * @date 2019/1/5 12:25
 */
class ReversibleArrayList{
    private Pet[] pets;
    {
        pets = new Pet[8];
        for (int i = 0; i < 3; i++) {
            pets[i] = new Cat();
        }

        for (int i = 3; i < 6; i++) {
            pets[i] = new Dog();
        }

        for (int i = 6; i < 8; i++) {
            pets[i] = new Fish();
        }
    }
    public Iterator<Pet>  iterator(){
        return new Iterator<Pet>() {
            private int index = pets.length;
            @Override
            public boolean hasNext() {
                return index > 0;
            }

            @Override
            public Pet next() {
                return pets[--index];
            }
        };
    }
}

public class AdapterMethodIdiom  {
    public static void show(Iterator iterator){
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


    public static void main(String[] args) {
        show(new ReversibleArrayList().iterator());
    }
}

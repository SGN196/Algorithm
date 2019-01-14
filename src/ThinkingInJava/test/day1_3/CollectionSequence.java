package ThinkingInJava.test.day1_3;

import java.util.AbstractCollection;
import java.util.Collections;
import java.util.Iterator;

/**
 * @author SGN196
 * @date 2019/1/5 0:45
 */

class Fish extends Pet{

}

public class CollectionSequence extends AbstractCollection<Pet> {
    private Pet[] pets;
    {
        pets = new Pet[8];
        for (int i = 0; i < 3; i++) {
            pets[i] = new Cat();
        }

        for (int i = 3; i < 6; i++) {
            pets[i] = new Dog();
        }

        for (int i = 6; i < 7; i++) {
            pets[i] = new Fish();
        }
    }
    @Override
    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }
            public void remove(){
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override
    public int size() {
        return pets.length;
    }

    public static void main(String[] args) {
        CollectionSequence c = new CollectionSequence();
        InterfaceVsIterator.display(c);
        InterfaceVsIterator.display(c.iterator());
    }
}

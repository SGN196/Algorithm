package ThinkingInJava.test.day1_3;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 * @author SGN196
 * @date 2019/1/5 0:53
 */

class PetSequence{
    protected Pet[] pets;
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
}

public class NonCollectionSeqquence extends PetSequence{
    public Iterator<Pet> iterator(){
        return new Iterator<Pet>(){
            private int index = 0;

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }

            @Override
            public void forEachRemaining(Consumer<? super Pet> action) {

            }

            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }
        };
    }
}

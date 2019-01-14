package ThinkingInJava.test.day1_3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author SGN196
 * @date 2019/1/5 1:03
 */


class CollectionSequence2 extends PetSequence implements Collection<Pet> {


    @Override
    public boolean removeIf(Predicate<? super Pet> filter) {
        return false;
    }

    @Override
    public Spliterator<Pet> spliterator() {
        return null;
    }

    @Override
    public Stream<Pet> stream() {
        return null;
    }

    @Override
    public Stream<Pet> parallelStream() {
        return null;
    }


    @Override
    public Object[] toArray() {
        Object[] result = new Object[pets.length];
        System.arraycopy(pets, 0, result, 0, pets.length);
        return result;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Pet pet) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Pet> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
    @Override
    public boolean isEmpty() {
        return pets.length == 0;
    }
    public Iterator<Pet> iterator(){
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
        };
    }

    @Override
    public boolean contains(Object o) {
        if(o == null)
            return false;
        for (int i = 0; i < pets.length; i++) {
            if(o.equals(pets[i])){
                return true;
            }
        }
        return false;
    }
    @Override
    public int size() {
        return pets.length;
    }
}

public class E30_CollectionSequence2 {

    public static void main(String[] args) {
        CollectionSequence2 ss = new CollectionSequence2();
        for(Pet p : ss.pets){
            System.out.println(p);
        }
    }
}

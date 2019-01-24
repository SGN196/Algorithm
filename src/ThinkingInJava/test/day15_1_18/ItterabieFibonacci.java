package ThinkingInJava.test.day15_1_18;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * @author SGN196
 * @date 2019/1/18 16:09
 */

public class ItterabieFibonacci  extends  Fibonacci implements Iterable<Integer>{
    @Override
    public Iterator<Integer> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {

    }

    @Override
    public Spliterator<Integer> spliterator() {
        return null;
    }
}

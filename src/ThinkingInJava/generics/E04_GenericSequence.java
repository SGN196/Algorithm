package ThinkingInJava.generics;

/**
 * @author SGN196
 * @date 2019/1/17 21:14
 */


interface Selector<T>{
    boolean end();
    T current();
    void next();

}

class Sequence<T>{
    private Object[] items;
    private int next;
    public Sequence(int size) {
        items = new Object[size];
    }

}

public class E04_GenericSequence {

}

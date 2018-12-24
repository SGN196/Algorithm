package ThinkingInJava.innerclasses;

/**
 * @author SGN196
 * @date 2018/12/22 16:25
 */

class Sequence2{
    private Object[] items;
    private int next;
    public Sequence2(int size){
        items = new Object[size];
    }
    public void add(Object x){
        if(next < items.length)
            items[next++] = x;
    }
    
}


public class E04_SequenceSelectorTooSequence {
    public static void main(String[] args) {


    }
}

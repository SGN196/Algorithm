package ThinkingInJava.innerclasses;

import javax.naming.event.ObjectChangeListener;

/**
 * @author SGN196
 * @date 2018/12/28 1:33
 */
interface Selector{
    boolean end();
    Object current();
    void next();
}

class Sequence3{
    private Object[] objects;
    private int next;
    public Sequence3(int size){
        objects = new Object[size];
    }
    public void add(Object x){
        if(next < objects.length)
            objects[next++] = x;
    }

    class SequenceSelector implements Selector{
        private int i = 0;
        @Override
        public boolean end() {
            return false;
        }

        @Override
        public Object current() {
            return objects[i];
        }

        @Override
        public void next() {
            if(i <= objects.length){
                i++;
            }
        }
    }
    class ReverseSelector implements Selector{
        int i = objects.length - 1;

        @Override
        public boolean end() {
            return false;
        }

        @Override
        public Object current() {
            return null;
        }

        @Override
        public void next() {

        }
    }



}


public class E22_GetRSelector {
}

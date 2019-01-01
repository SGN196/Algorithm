package ThinkingInJava.hoding;


import java.util.ArrayList;
import java.util.List;

/**
 * @author SGN196
 * @date 2018/12/28 16:42
 */
interface Selector{
    public boolean end();
    public Object current();
    public void next();
}

class UnlimitedSequence {
    private final List<Object> items = new ArrayList<Object>();
    private int i;
    public void add(Object x){
        items.add(x);
    }
    private class SequenceSeletor implements Selector {
        @Override
        public boolean end() {
            return i == items.size();
        }

        @Override
        public Object current() {
            return items.get(i);
        }

        @Override
        public void next() {
            if(i < items.size())
                i++;
        }
    }
    public Selector selector(){
        return new SequenceSeletor();
    }
}

public class E03_UnlimitedSequence{
    public static void main(String[] args) {
        UnlimitedSequence sequence = new UnlimitedSequence();
        for (int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
        }
        Selector selector = sequence.selector();
        while(!selector.end()){
            System.out.println(selector.current());
            selector.next();
        }

    }

}
package ThinkingInJava.innerclasses;

import ThinkingInJava.test12_22.Sequence;

/**
 * @author SGN196
 * @date 2018/12/22 15:23
 */

class StringHolder{
    private String data;
    StringHolder(String data){
        this.data = data;
    }
    public String toString(){
        return data;
    }
}

public class E02_SequenceOfStringHolders {

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++) {
            sequence.add(new StringHolder(Integer.toString(i)));
        }
        sequence.selector();

    }


}

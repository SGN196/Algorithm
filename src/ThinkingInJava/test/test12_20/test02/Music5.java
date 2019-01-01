package ThinkingInJava.test.test12_20.test02;

import ThinkingInJava.test.test12_19.test01.Note;

/**
 * @author SGN196
 * @date 2018/12/20 15:20
 */

interface  Instrument{
    int VALUE = 5;
    void play(Note n);
    void adjust();
}

class Wind implements Instrument{
    public void play(Note n){
        System.out.println(this + ".play() " + n);
    }
    public String  toString(){
        return "Wind";
    }
    public void adjust(){
        System.out.println(this + ".adjust()");
    }
}

public class Music5 {
    static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
//        Wind wind = new Wind();
        tune(new Wind());
    }

}

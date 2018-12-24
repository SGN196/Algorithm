package ThinkingInJava.interfaces;

import ThinkingInJava.test12_19.test01.Note;

/**
 * @author SGN196
 * @date 2018/12/20 16:36
 */

interface Playable{
    public void play(Note n);
}

abstract  class Instrument{
    public void play(Note n){
        System.out.println(this + ".play()" + n);
    }
    public void adjust(){
        System.out.println(this + ".adjust()");
    }
    public abstract String toString();
}
public class E09_AbstractMusic5 {
    static void tune(Instrument i){
        i.adjust();
        i.play(Note.MIDDLE_C);
    }
    static void tuneAll(Instrument[] e){
        for(Instrument i : e)
            tune(i);
    }


}

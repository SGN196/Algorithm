package ThinkingInJava.interfaces;

import ThinkingInJava.test12_19.test01.Note;

/**
 * @author SGN196
 * @date 2018/12/20 16:44
 */


interface Playable2{
    public void play(Note n);
}

interface Instrument2{
    public void adjust();
    public abstract String toString();
}
class Wind2 implements Instrument2, Playable2{
    @Override
    public void adjust() {

    }

    @Override
    public void play(Note n) {

    }
}
public class E10_PlayableMusic5 {
}

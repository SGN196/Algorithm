package ThinkingInJava.test.test12_19.test01;

/**
 * @author SGN196
 * @date 2018/12/19 10:43
 */

class Instrument{
    void play(Note n){
        System.out.println("Instrument.play()");
    }
    public String  toString(){
        return "Instrument";
    }
    void adjust(){
        System.out.println("adjusting Instrument");
    }
}

class Wind extends Instrument{
    void play(Note n){
        System.out.println("wind.play() " + n);
    }
    public String toString(){
        return "Wind";
    }
    void adjust(){
        System.out.println("adjusting Wind");
    }
}
class Percussion extends Instrument{
    void play(Note n){
        System.out.println("Percussion.play() " + n);
    }
    public String toString(){
        return "Percussion";
    }
    void adjust(){
        System.out.println("adjusting Percussion");
    }
}


class Stringed extends Instrument{
    void play(Note n){
        System.out.println("Stringed.play() " + n);
    }
    public String toString(){
        return "Stringed";
    }
    void adjust(){
        System.out.println("adjusting Stringed");
    }
}
class Brass extends Instrument{
    void play(Note n){
        System.out.println("Brass.play() " + n);
    }
    public String toString(){
        return "Brass";
    }
    void adjust(){
        System.out.println("adjusting Brass");
    }
}
class Woodwind extends Instrument{
    void play(Note n){
        System.out.println("Woodwind.play() " + n);
    }
    public String toString(){
        return "Woodwind";
    }
    void adjust(){
        System.out.println("adjusting Woodwind");
    }
}

public class Music3 {
    public static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Instrument[] e){
        for(Instrument i : e){
            tune(i);
        }
    }
    public static void main(String[] args) {
        Instrument[] orchestra = { new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind()};
        for (int i = 0; i < 10; i++) {
            int obj = (int)(Math.random() * 5);
            tune(orchestra[obj]);

        }
//        tuneAll(orchestra);
    }
}

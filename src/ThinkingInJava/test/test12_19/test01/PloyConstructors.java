package ThinkingInJava.test.test12_19.test01;

/**
 * @author SGN196
 * @date 2018/12/19 20:25
 */

class Glyph{
    void draw(){
        System.out.println("glyph.draw()");
    }
    Glyph(){
        System.out.println("glyph() before draw()");
        draw();
        System.out.println("glyph() after draw()");
    }
}
class RoundGlyph extends Glyph{
    private int radius = 1;
    RoundGlyph(int r){
        radius = r;
        System.out.println("roundGlyph.roundGlyph(). radius = " + radius);
    }
    void draw(){
        System.out.println("Roundglyph.draw(), radius = " + radius);
    }
}


public class PloyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
    }
}

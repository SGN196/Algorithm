package ThinkingInJava.test12_20.test02;

/**
 * @author SGN196
 * @date 2018/12/20 22:52
 */
interface CanFight{
    void fight();
}
interface CanSwim{
    void swim();
}
interface CanFly {
    void fly();
}
interface  CanClimb{
    void can();
}

class ActionCharacter{
    public void fight(){

    }
}
class Hero extends ActionCharacter implements CanFight, CanFly, CanSwim, CanClimb{

    @Override
    public void swim() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void can() {

    }
}

public class Adventure {
    public static void t(CanFight x){ x.fight();}

    public static void main(String[] args) {
        Hero h = new Hero();
    }

}

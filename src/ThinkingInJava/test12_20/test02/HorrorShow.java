package ThinkingInJava.test12_20.test02;

/**
 * @author SGN196
 * @date 2018/12/21 0:25
 */

interface Monster{
    void menace();
}

interface DangerousMonster extends Monster{
    void destroy();
}
interface  Lethal{
    void kill();
}

class DragonZilla implements DangerousMonster{
    @Override
    public void menace() {

    }

    @Override
    public void destroy() {

    }
}




public class HorrorShow {

}

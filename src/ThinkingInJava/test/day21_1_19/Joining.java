package ThinkingInJava.test.day21_1_19;

/**
 * @author SGN196
 * @date 2019/1/22 0:53
 */

class Sleeper extends Thread{
    private int duration;
    public Sleeper(String name, int time){
        super(name);
        duration = time;
        start();
    }
    public void run(){
        try {
            System.out.println(getName() + " : 1");
            System.out.println("++" + isInterrupted());
            sleep(duration);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName() + " has awakened");
    }
}

class Joiner extends Thread{
    private Sleeper sleeper;
    public Joiner(String name, Sleeper s){
        super(name);
        sleeper = s;
        start();
    }
    public void run(){
        try {
            System.out.println("--" + sleeper.isInterrupted());
            sleeper.join();
            sleeper.interrupt();
            System.out.println("--" + sleeper.isInterrupted());
            sleep(100);
            System.out.println("--" + sleeper.isInterrupted());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName() + " join completed");
        System.out.println("--" + sleeper.isInterrupted());
    }

}

public class Joining {
    public static void main(String[] args) {
//        new Sleeper("sleep", 5000);
        new Joiner("join", new Sleeper("sleep", 5000));


    }
}

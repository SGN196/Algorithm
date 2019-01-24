package ThinkingInJava.test.day21_1_19;

import org.junit.Test;

/**
 * @author SGN196
 * @date 2019/1/19 22:05
 */

public class LiftOff implements Runnable {
    protected int countDown = 5;
    private static  int taskCount = 0;
    private final int id = taskCount++;
    public LiftOff(){

    }
    public LiftOff(int countDown){
        this.countDown = countDown;
    }
    public String status(){
        return "#" + id + "(" + (countDown > 0 ? countDown : "Liftoff!") + ").";
    }
    @Override
    public void run() {
        while(countDown-- > 0){
            System.out.println(status());
            Thread.yield();
        }

    }

    public static void main(String[] args) {
//        LiftOff launch = new LiftOff();
//        launch.run();
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("wwwwwwwwwwwwwwwwwww");


    }

}

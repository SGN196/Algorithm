package ThinkingInJava.concurrency;

/**
 * @author SGN196
 * @date 2019/1/20 1:11
 */

class Printer implements Runnable{
    private static int taskCount;
    private final int id = taskCount++;
    Printer(){
        System.out.println("Printer start, id = " + id);
    }

    @Override
    public void run() {
        System.out.println("stage 1 .... id = " + id);
        Thread.yield();
        System.out.println("stage 2 .... id = " + id);
        Thread.yield();
        System.out.println("stage 3 .... id = " + id);
        Thread.yield();
        System.out.println("Printer end id = " + id);

    }
}

public class E01_Runnable {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new Printer()).start();
        }
    }
}

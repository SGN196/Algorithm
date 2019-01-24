package ThinkingInJava.test.day21_1_19;

/**
 * @author SGN196
 * @date 2019/1/22 1:34
 */

class UnresponsiveUI{
    private volatile double d = 1;
    private UnresponsiveUI() throws Exception{
        while(d > 0)
            d = d + (Math.PI + Math.E) / d;
        System.in.read();
    }
}

public class ResponsiveIO extends Thread {
    private static volatile double d = 1;
    public ResponsiveIO(){
        setDaemon(true);
        start();
    }
    public void run(){
        while(true){
            d = d + (Math.PI + Math.E) /d;

        }

    }

    public static void main(String[] args) throws Exception {
        new ResponsiveIO();
        int a;
        StringBuilder sb = new StringBuilder();
        while((a = System.in.read()) != (int)'#'){
            sb.append((char)a);
        }
        System.out.println(d);
        System.out.println("number : " + sb.toString());
    }
}

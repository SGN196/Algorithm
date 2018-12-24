package test.ZuoPractice.Junior.jvmTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SGN196
 * @date 2018/12/18 12:18
 */

public class JConsoleTest {
    public byte[] b1 = new byte[128 * 1024];


    public static void main(String[] args) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("start...");
        fill(10000);

    }

    private static void fill(int n) {

        List<JConsoleTest> jlist = new ArrayList<JConsoleTest>();

        for (int i = 0; i < n; i++) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            jlist.add(new JConsoleTest());

        }
        
        

    }


}

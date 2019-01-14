package ThinkingInJava.test.day1_8;

import net.mindview.util.BinaryFile;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author SGN196
 * @date 2019/1/9 19:04
 */

public class Hex {
    public static String format(byte[] data){
//        System.out.println(new String(data,0, data.length));
        StringBuilder result = new StringBuilder();

        for(byte b : data){
            int high = (int)b >> 4;
            int low = (int)b & 15;
            result.append(String.format("%02X", b));
        }
        return result.toString();
    }

    @Test
    public void test01(){
        byte b = 'c';
        System.out.println(b);
        int high = (int)b >> 4;
        int low = (int)b & 15;
        System.out.println(high + "  " + low);
    }

    public static void main(String[] args) {
        InputStream is = null;
        try {
            is = new FileInputStream(new File("D:\\1.java"));
            int len;
            byte[] b = new byte[20];
            while((len = is.read(b)) != -1){
                format(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}

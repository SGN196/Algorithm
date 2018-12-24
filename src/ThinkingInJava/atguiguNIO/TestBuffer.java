package ThinkingInJava.atguiguNIO;

import org.junit.Test;

import java.nio.ByteBuffer;

/**
 * @author SGN196
 * @date 2018/12/18 22:43
 */

public class TestBuffer {


    @Test
    public void test01(){
        ByteBuffer buf = ByteBuffer.allocateDirect(1024 * 1024 * 4* 1024);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void test03(){
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(1024);
        System.out.println(byteBuffer.isDirect());
    }

}

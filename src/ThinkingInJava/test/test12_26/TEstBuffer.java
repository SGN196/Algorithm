package ThinkingInJava.test.test12_26;

import org.junit.Test;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author SGN196
 * @date 2018/12/26 22:13
 */

public class TEstBuffer {
    @Test
    public void test01(){
        ByteBuffer buf1 = ByteBuffer.allocateDirect(1024);
        ByteBuffer buf2 = ByteBuffer.allocate(1024);
    }

    @Test
    public void testChannel(){
        long startTime = System.currentTimeMillis();
        FileInputStream fis = null;
        FileOutputStream fos = null;
        FileChannel inChannel = null;
        FileChannel outChannel = null;
        try {
            fis = new FileInputStream("D:\\3.mp4");
            fos = new FileOutputStream("D:\\5.mp4");


            inChannel = fis.getChannel();
            outChannel = fos.getChannel();

            ByteBuffer buf = ByteBuffer.allocate(1024* 1024 * 64);
            while(inChannel.read(buf) != -1){  //将通道的数据，读入缓冲区中
                buf.flip();
                outChannel.write(buf);
                buf.clear();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(outChannel != null)
                try {
                    outChannel.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if(inChannel != null)
                try {
                    inChannel.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if(fis != null)
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if(fos != null)
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

        }
        System.out.println(System.currentTimeMillis() - startTime);

    }
    @Test
    public void test2(){
        long startTime = System.currentTimeMillis();
        FileChannel inChannel = null;
        FileChannel outChannel = null;
        try {
            inChannel = FileChannel.open(Paths.get("D:\\3.mp4"), StandardOpenOption.READ);
            outChannel = FileChannel.open(Paths.get("D:\\4.mp4"),StandardOpenOption.READ, StandardOpenOption.WRITE, StandardOpenOption.CREATE_NEW);
            MappedByteBuffer  inMappedBuf = inChannel.map(FileChannel.MapMode.READ_ONLY, 0, inChannel.size());
            MappedByteBuffer outMappedBuf = outChannel.map(FileChannel.MapMode.READ_WRITE, 0, inChannel.size());
            System.out.println(inMappedBuf.limit());
            byte[] dst = new byte[inMappedBuf.limit()];
            inMappedBuf.get(dst);
            outMappedBuf.put(dst);

        }catch(IOException e){
            e.printStackTrace();
        }finally {
            if(inChannel != null) {
                try {
                    inChannel.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(outChannel != null){
                try {
                    outChannel.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
        System.out.println("time = " + (System.currentTimeMillis() - startTime));
    }
    @Test
    public void test03() {
        FileChannel inChannel = null;
        FileChannel outChannel = null;
        try {
            inChannel = FileChannel.open(Paths.get("D:\\3.mp4"), StandardOpenOption.READ);
            outChannel = FileChannel.open(Paths.get("D:\\4.mp4"), StandardOpenOption.READ, StandardOpenOption.WRITE, StandardOpenOption.CREATE_NEW);
            inChannel.transferTo(0, inChannel.size(), outChannel);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inChannel.close();
                outChannel.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void test04() throws IOException{
        RandomAccessFile raf1 = new RandomAccessFile("D:\\1.txt", "rw");
        FileChannel channel = raf1.getChannel();

        ByteBuffer buf1 = ByteBuffer.allocate(100);
        ByteBuffer buf2 = ByteBuffer.allocate(1024);

        ByteBuffer[] bufs = {buf1, buf2};

        channel.read(bufs);

        for(ByteBuffer f : bufs){
            f.flip();
        }
        System.out.println(new String(bufs[0].array(), 0, bufs[0].limit()));
        System.out.println("--------------------");
        System.out.println(new String(bufs[1].array(), 0, bufs[1].limit()));

        RandomAccessFile raf2 = new RandomAccessFile("D:\\2.txt", "rw");
        FileChannel channel2 = raf2.getChannel();

        channel2.write(bufs);
        channel2.close();
    }
    @Test
    public void test05() throws IOException{
        File file = new File("D:\\1.txt");
        FileWriter fw = new FileWriter(file);
        for (int i = 0; i < ((1<<16) - (1 << 13)); i++) {
            fw.write(i);
        }
        System.out.println((1<<16) - (1<< 13)  );
        fw.close();
    }

    @Test
    public void test5(){
        Map<String, Charset> map = Charset.availableCharsets();
        Set<Map.Entry<String, Charset>> set =  map.entrySet();
        for(Map.Entry<String, Charset> entry : set){
            System.out.println(entry.getKey());
        }
    }
}

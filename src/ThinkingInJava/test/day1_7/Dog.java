package ThinkingInJava.test.day1_7;

import org.junit.Test;

import java.io.*;
import java.util.Scanner;

/**
 * @author SGN196
 * @date 2019/1/7 8:46
 */


class Pet{
    public void show(){
        System.out.println("pet.show()");
    }
}

public class Dog extends Pet{
    public void show(){
        System.out.println("dog.show()");
        File file = new File("D:\\1.java");
        try {
            throw new IOException();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void readData() throws EOFException{

        try {
            InputStream inputStream = new FileInputStream("D:\\1.java");
            int b;
            while((b = inputStream.read()) != -1){
                System.out.print((char)b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void abc() throws Exception{

        try {
            FileInputStream fileInputStream = new FileInputStream("D:\\1.j5ava");
        } catch (FileNotFoundException e) {
            Throwable se = new IOException("database error");
            se.initCause(e);
            try {
                throw se;
            } catch (Throwable throwable) {
                System.out.println("catch it:");
                throwable.printStackTrace();
            }
        }
    }

    @Test
    public void test01(){
        FileInputStream fis = null;
        try {
            try {
                fis = new FileInputStream("D:\\1.jjj");
            } finally {
                fis.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }



}

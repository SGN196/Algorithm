package ThinkingInJava.test.day1_7;

import com.sun.tools.hat.internal.model.StackTrace;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author SGN196
 * @date 2019/1/7 15:15
 */

public class test02 {

    public static int f(){
        int a = 3;
        try{
            a = a * a;
            return a;
        }finally {
            if(a == 9)
                return 0;
        }


    }



    public static void main(String[] args) {
        System.out.println(f());
    }

    @Test
    public void test04(){
        Throwable t= new Throwable();
        StackTraceElement[] frames = t.getStackTrace();
        for(StackTraceElement frame : frames){
            System.out.println(frame);
        }

        ArrayList<Integer> list = new ArrayList<>();

    }

    @Test
    public void test01(){
        Map<Thread, StackTraceElement[]>  map = Thread.getAllStackTraces();
        for (Thread t : map.keySet()){
            StackTraceElement[] frames = map.get(t);
            for(StackTraceElement f : frames){
                System.out.println(f);
            }
        }
    }


    public static int factorial(int num){
        System.out.println("---------------------------------------------------");
        Throwable t = new Throwable();
        StackTraceElement[] frames = t.getStackTrace();
        for(StackTraceElement f : frames){
            System.out.println(f);
        }
        if(num == 1){
            return 1;
        }else{
            return num * factorial(num - 1);
        }
    }
    @Test
    public void test02(){
        factorial(3);
    }

    @Test
    public void test05(){
        LinkedList<Integer> stack = new LinkedList<Integer>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 3000000; i++) {
            stack.push(i);
        }
//        System.out.println(stack.size());


        while(!stack.isEmpty()){
            stack.pop();
        }
        System.out.println(System.currentTimeMillis() - start);
    }
    @Test
    public void test06(){
        Stack<Integer> stack = new Stack<Integer>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 3000000; i++) {
            stack.push(i);
        }
        long start1 = System.currentTimeMillis();
        while(!stack.isEmpty()){
            stack.pop();
        }
        System.out.println(System.currentTimeMillis() - start1);

    }
    @Test
    public void test07(){
        ArrayList<Integer> stack = new ArrayList<Integer>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 3000000; i++) {
            stack.add(i);
        }
        long start1 = System.currentTimeMillis();
        while(!stack.isEmpty()){
            stack.remove(stack.size() - 1);
        }
        System.out.println(System.currentTimeMillis() - start1);
    }

    @Test
    public void test08(){
        ArrayList<Integer> stack = new ArrayList<Integer>();

        for (int i = 0; i < 3000000; i++) {
            stack.add(i);
        }
        long start = System.currentTimeMillis();
        try{
            stack.remove(stack.size() - 1);
        }catch (Exception e) {
            System.out.println(System.currentTimeMillis() - start);
            e.printStackTrace();
        }
        System.out.println(System.currentTimeMillis() - start);
    }
    @Test
    public void test09(){
        Stack<Integer> stack = new Stack<Integer>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 3000000; i++) {
            stack.push(i);
        }
        long start1 = System.currentTimeMillis();
        try{
            stack.pop();
        }catch (EmptyStackException e){
            e.printStackTrace();

        }
        System.out.println(System.currentTimeMillis() - start1);

    }
}

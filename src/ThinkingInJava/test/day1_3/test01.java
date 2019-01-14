package ThinkingInJava.test.day1_3;

import net.mindview.util.TextFile;
import org.junit.Test;

import java.io.*;
import java.util.*;

/**
 * @author SGN196
 * @date 2019/1/4 11:39
 */



class Pet{

}
class Cat extends Pet{

}
class Dog extends Pet{

}
public class test01 {
    @Test
    public void test01(){
        LinkedList<Integer> list = new LinkedList<>();
        list.offer(3);
        list.offer(2);
        list.offer(4);
        list.offer(1);
        list.offer(5);
        System.out.println(list);
        List<Integer> pet = list.subList(1,4);
        list.set(1,55);

        Object[] o = list.toArray();


        for(Integer i : pet){
            System.out.println(i);
        }
        Collections.shuffle(list);


    }
    @Test
    public void test02(){
        Stack<String> stack = new Stack<String>();
        for(String s : "My dog Has fleas".split(" ")){
            stack.push(s);
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }


    }

    @Test
    public void test03(){
        Set<String> set1 = new HashSet<String>();
        Collections.addAll(set1 ,"A B C D E F G H I J K L".split(" "));


    }

    @Test
    public void test04(){
        Set<String> words = new TreeSet<String>();
        File file = new File("D:\\1.java");
        try {
            FileReader fr = new FileReader(file);
            char[] chs = new char[1024];
            int len = 0;
            while((len = fr.read(chs)) != -1){
                for (int i = 0; i < chs.length; i++) {


                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

    }
    @Test
    public void test05(){
        Set<String> words = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
    }


    @Test
    public void test06(){
        Set<String> words = new TreeSet<String>(new TextFile("D:\\1.java", "\\W+"));
        System.out.println(words);
    }

    @Test
    public void test07(){
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            int num = random.nextInt(20);
            int count = 0;
            if(hashMap.containsKey(num))
                count = hashMap.get(num);

            hashMap.put(num, count + 1);

        }
        System.out.println(hashMap);
    }

    @Test
    public void test08(){
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        hashMap.put(1,1);
        hashMap.put(1,10);
        System.out.println(hashMap);
    }

    @Test
    public void test10(){
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println(list.pop());
    }


}



















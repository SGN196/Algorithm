package ThinkingInJava.test.day1_2;

import org.junit.Test;

import java.util.*;

/**
 * @author SGN196
 * @date 2019/1/2 16:54
 */
class  Snow {}
class Powder extends Snow{}
class Crusty extends Snow{}
class Slush extends Snow{}



class Light extends Powder{}
class Heavy extends Powder{}


public class Addinggroups {


    @Test
    public void test06(){
        ArrayList<Snow> list = new ArrayList<>();
        list.add(new Powder());
        list.add(new Powder());
        list.add(new Powder());
        list.add(new Powder());
        list.add(new Powder());
        list.add(new Powder());
        System.out.println(list.size());
        list.add(2, new Slush());
        System.out.println(list.size());
//        Collections.sort(list);
        for(Snow n : list){
            System.out.println(n.getClass().getSimpleName());
        }

    }

    @Test
    public void test05(){
        ArrayList<Snow> list = new ArrayList<>();
        list.add(new Powder());
        list.add(new Powder());
        Slush slush = new Slush();
        list.add(slush);
        System.out.println(list.contains(slush));
        list.remove(slush);
//        Snow snow = list.get(2);   会抛出IndexOutofBoundsException
//        System.out.println(snow);
        list.add(slush);
        System.out.println(list.indexOf(slush));

    }

    public static void main(String[] args) {
//        Collection<Integer> collection =  new ArrayList <Integer>();
//        collection.add(5);
//        collection.add(4);
//        collection.add(3);
//        collection.add(2);
//        collection.add(1);
//        Object[] obj = collection.toArray();
//        for(Object o : obj){
//            System.out.println(o);
//        }
//        show(1);
        List<Snow> snow3 = new ArrayList<Snow>();
        Collections.addAll(snow3, new Heavy(), new Light());
        for (int i = 0; i < snow3.size(); i++) {
            System.out.println(snow3.get(i));

        }
        List<Snow> snow4 = Arrays.<Snow>asList(new Light(), new Heavy());
        for (int i = 0; i < snow4.size(); i++) {
            System.out.println(snow4.get(i));

        }
        System.out.println("----------------");
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.offer(3);
        queue.offer(2);
        queue.offer(1);
        queue.offer(4);
        queue.offer(5);
        System.out.println(queue.peek());

    }

    @Test
    public void test01(){
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(2);
        set.add(1);
        set.add(3);
        set.add(5);
        set.add(4);
//        System.out.println(set.pollFirst());
        System.out.println(set);
//        System.out.println(set.pollFirst());
    }

    @Test
    public void test02(){
        int a = -8;
        System.out.println(a >>> 1);
        System.out.println(a >> 1);
        System.out.println(1 << 30);
        System.out.println((1 << 31) - 1);
    }

    @Test
    public void test03(){
        HashSet<Integer> set = new HashSet<>();
        set.add(3);
        set.add(2);
        set.add(4);
        set.add(1);
        set.add(5);
        System.out.println(set.toString());
    }

    @Test
    public void test04(){
        LinkedList<Integer> list = new LinkedList<>();
        list.offer(3);
        list.offer(2);
        list.offer(4);
        list.offer(1);
        list.offer(5);
        Integer a = list.peek();
        System.out.println(list);
    }



    public static void show(int... a){
        System.out.println(a.getClass().getSimpleName());

    }
}

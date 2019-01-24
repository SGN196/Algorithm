package ThinkingInJava.test.day15_1_18;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author SGN196
 * @date 2019/1/18 0:50
 */

public class RandomList<T> {

    private ArrayList<T> arrayList = new ArrayList<T>();
    public void add(T item){
        arrayList.add(item);
    }
    public Random random = new Random(47);

    public T select(){
        return arrayList.get(random.nextInt(arrayList.size()));
    }

    public static void main(String[] args) {
        RandomList<String> randomList = new RandomList<String>();
        for(String s : "The quick brown fox jumped over the lazy brown dog".split(" ")){
            randomList.add(s);
        }
        for (int i = 0; i < 20; i++) {
            System.out.println(randomList.select());

        }
    }
}

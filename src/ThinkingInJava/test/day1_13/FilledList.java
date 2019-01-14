package ThinkingInJava.test.day1_13;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SGN196
 * @date 2019/1/13 12:18
 */


class CountedInteger{
    private static long counter;
    private final long id = counter++;
    public String toString(){
        return Long.toString(id);
    }
}


public class FilledList<T> {
    private Class<T> type;
    public FilledList(Class<T> type){
        this.type = type;
    }
    public List<T> create(int nelements)throws Exception{
        List<T> result = new ArrayList<T>();
        for (int i = 0; i < nelements; i++) {
            result.add(type.getDeclaredConstructor().newInstance());
        }

        return result;
    }
    public static void main(String[] args) throws Exception{
        FilledList<CountedInteger> fl = new FilledList<CountedInteger>(CountedInteger.class);
        System.out.println(fl.create(15));
    }


}

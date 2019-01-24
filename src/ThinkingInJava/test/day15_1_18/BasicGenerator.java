package ThinkingInJava.test.day15_1_18;


import net.mindview.util.Generator;

import java.lang.reflect.InvocationTargetException;

/**
 * @author SGN196
 * @date 2019/1/18 17:24
 */

public class BasicGenerator<T> implements Generator<T> {
    private Class<T> type;

    public BasicGenerator(Class<T> type){
        this.type = type;
    }

    @Override
    public T next() {
        try {
            return type.getDeclaredConstructor().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static <T> Generator<T> create(Class<T> type){
        return new BasicGenerator<T> (type);
    }
}

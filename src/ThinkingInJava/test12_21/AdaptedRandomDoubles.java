package ThinkingInJava.test12_21;

import java.io.IOException;
import java.nio.CharBuffer;

/**
 * @author SGN196
 * @date 2018/12/21 11:09
 */

public class AdaptedRandomDoubles extends RandomDoubles implements Readable {
    private int count;
    public AdaptedRandomDoubles(int count){
        this.count = count;
    }
    public int read(CharBuffer cb){
        if(count-- == 0)
            return -1;
        String result = Double.toString(next()) + " ";
        cb.append(result);
        return result.length();
    }



}

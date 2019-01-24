package ThinkingInJava.test.day21_1_19;

/**
 * @author SGN196
 * @date 2019/1/22 12:09
 */

public abstract class IntGenerator {
    private volatile boolean canceled = false;
    public abstract int next();
    public void cancel(){
        canceled = true;
    }
    public boolean isCanceled(){
        return canceled;
    }
}

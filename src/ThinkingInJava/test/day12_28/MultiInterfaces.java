package ThinkingInJava.test.day12_28;

/**
 * @author SGN196
 * @date 2018/12/28 1:05
 */

interface A{}
interface B{}

class X implements A, B{}

class Y implements A{
    B makeB(){
        return new B(){

        };
    }
}
public class MultiInterfaces {
}

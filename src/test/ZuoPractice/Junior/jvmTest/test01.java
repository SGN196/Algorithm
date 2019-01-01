package test.ZuoPractice.Junior.jvmTest;

/**
 * @author SGN196
 * @date 2018/12/22 17:17
 */


import org.junit.Test;

/**
 * 用数组结构实现大小固定的队列和栈
 */
public class test01 {




    private Integer[] arr ;
    private Integer index;

    public test01(int initSize){
        if(initSize < 0){
            throw new IllegalArgumentException("the init size is less than 0");
        }
        arr = new Integer[initSize];
    }

    public void push(Integer num){
        if(index >= arr.length){
            System.out.println("the stack is full");
            return;
        }
        if(num == null){
            return;
        }
        arr[index++] = num;
    }
    public Integer pop(){
        if(index == 0){
            return null;
        }
        return arr[--index];
    }
    public Integer peek(){
        if(index == 0){
            return null;
        }
        return arr[index - 1];
    }
    public Integer getSize(){
        return index;
    }


    public static void main(String[] args) {

    }

}

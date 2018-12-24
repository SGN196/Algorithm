package test.ZuoPractice.Junior.jvmTest;

/**
 * @author SGN196
 * @date 2018/12/22 17:23
 */

public class test02 {
    private Integer[] arr;
    private Integer start = 0;
    private Integer end = 0;
    private Integer size = 0;
    public test02(int initSize){
        if(initSize < 0)
            throw new IllegalArgumentException("the init size is less than 0");
        arr = new Integer[6];
    }

    private boolean isEmpty(){
        if(size == 0){
            return true;
        }else{
            return false;
        }
    }


    public void offer(Integer num){
        if(size >= arr.length){
            throw new IllegalArgumentException("queue is full");
        }
        if(num == null)
            return;
        size++;
        arr[end] = num;
        if(end == arr.length -1)
            end = 0;
        else
            end++;

    }

    public Integer pop(){
        if(size == 0){
            throw new IllegalArgumentException("queue is empty");
        }
        size--;
        int tmp = start;
        if(start == arr.length - 1)
            start = 0;
        else
            start++;
        return arr[tmp];

    }
    public Integer peek(){
        if(size == 0) {
            return null;
        }
        return arr[start];
    }





}

package test.ZuoPractice.Junior;

/**
 * @author SGN196
 * @date 2018/12/17 0:48
 */

public class Median {
    public static int[] generateRandomArray(int size, int value){
        int[] arr = new int[(int)((size + 1) * Math.random())];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)((value + 1) * Math.random()) - (int)(value * Math.random());
        }
        return arr;
    }
    public static void swap(int[] arr, int L, int R){
        int temp = arr[L];
        arr[L] = arr[R];
        arr[R] = temp;
    }
    public static void show(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }


    public static void heapInsert(int[] arr){  //将数组变为大顶堆
        if(arr.length < 2 || arr == null)
            return ;
        for (int index = 0; index < arr.length; index++) {
            while(arr[(index - 1) / 2]  < arr[index]){
                swap(arr, (index - 1) / 2, index);
                index = (index - 1) / 2;
            }

        }
    }

    public static void heapify(int[] arr, int index, int heapSize){     //从某个值开始，调整堆中的元素
        int left = index * 2 + 1;
        while(left < heapSize){
            int largest = 0;
            if((left + 1) < heapSize && arr[left] < arr[left + 1]){
                largest = left + 1;
            }else
                largest = left;
            if(arr[index] > arr[largest])
                largest = index;
            if(largest == index){
                break;
            }
            swap(arr, largest, index);
            index = largest;
            left = index* 2 + 1;

        }
    }

    public static void heapSort(int[] arr){
        if(arr == null || arr.length < 2){
            return ;
        }
        heapInsert(arr);
        int heapSize = arr.length;
        swap(arr, 0, --heapSize);
        while(heapSize > 0){
            heapify(arr, 0, heapSize);
            swap(arr, 0,--heapSize);
        }
    }









    public static void main(String[] args) {
        int[] a = generateRandomArray(20000, 50000);
//        heapInsert(a);
//        swap(a, 0, a.length - 1);
//        show(a);
        System.out.println();
        heapSort(a);
        show(a);
    }
}

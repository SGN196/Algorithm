package test.ZuoPractice.Junior;

/**
 * @author SGN196
 * @date 2018/12/15 13:34
 */

public class BigRootHeap {

    public static void heapSort(int[] arr){
        if(arr == null || arr.length < 2){
            return ;
        }
        for (int i = 0; i < arr.length; i++) {
            heapInsert(arr, i);
        }

    }
    public static int[] copyArray(int[] arr){
        if(arr == null){
            return null;
        }
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        return res;
    }


    public static void heapInsert(int[] arr, int index){
        while(arr[(index - 1) / 2] < arr[index]) {
            swap(arr, (index - 1) / 2, index);
            index =  (index - 1) / 2;
        }

    }
    public static void swap(int[] a, int L, int R){
        int temp = a[L];
        a[L] = a[R];
        a[R] = temp;
    }

    public static int[] generateRandomArray(int size, int value){
        int[] arr = new int[(int)((size + 1) * Math.random())];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)((value + 1) * Math.random()) - (int)(value * Math.random());
        }
        return arr;
    }
    public static boolean isEqual(int[] arr1, int[] arr2){
        if((arr1 == null && arr2 != null) || (arr1 != null && arr2 == null)){
            return false;
        }
        if(arr1 == null && arr2 == null){
            return true;
        }
        if(arr1.length != arr2.length){
            return false;
        }
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }

    public static void heapifyRighttt(int[] arr, int index, int size) {
        int left = index * 2 + 1;
        while (left < size) {
            int largest = left + 1 < size && arr[left + 1] > arr[left] ? left + 1 : left;
            largest = arr[largest] > arr[index] ? largest : index;
            if (largest == index) {
                break;
            }
            swap(arr, largest, index);
            index = largest;
            left = index * 2 + 1;
        }
    }

    public static void show(int[] a){
        int temp = 1;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
//            if((temp - 1) == i){
//                System.out.println("");
//                temp *= 2;
//            }

        }
    }

    public static void heapify(int[] arr, int index, int heapSize){
        int left = index * 2 + 1;
        while(left < heapSize) {
            int largest = 0;
            if ((left + 1) < heapSize && arr[left + 1] > arr[left])
                largest = left + 1;
            else
                largest = left;
            if(arr[largest] < arr[index])
                largest = index;
            if (largest == index)
                return;
            swap(arr, largest, index);
            index = largest;
            left = index * 2 + 1;
        }
    }





    public static void main(String[] args) {
        int i = 0;
        boolean flag = true;
        while(i < 200000) {
            int[] a = generateRandomArray(20, 5000);
        //    int[] b = {2, 1, 3, 6, 0, 4};
            int[] b = copyArray(a);
            int[] c = copyArray(a);
            heapify(a, 0, a.length - 1);
            heapifyRighttt(c, 0, c.length -1  );
            if (!isEqual(a, c)) {
                flag = false;
                show(b);
                break;
            }
            i++;
            if(i % 1000 == 0){
                System.out.println(i);
            }
        }
        if(flag)
            System.out.println("success");
        else
            System.out.println("error");

    }
}

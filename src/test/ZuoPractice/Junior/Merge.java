package test.ZuoPractice.Junior;

/**
 * @author SGN196
 * @date 2018/12/17 20:20
 */

public class Merge {
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
    public static void merge(int[] arr, int L, int mid, int R){
        int[] help = new int[R - L + 1];
        int i = 0;
        int p1 = L;
        int p2 = mid + 1;
        while(p1 <= mid && p2 <= R){
//            if(arr[p1] < arr[p2]){
//                help[i++] = arr[p2++];
//            }else{
//                help[i++] = arr[p1++];
//            }
            help[i++] = arr[p1] < arr[p2] ? arr[p2++] : arr[p1++];
        }
        while(p1 > mid && p2 <= R)
            help[i++] = arr[p2++];
        while(p2 > R && p1 <= mid)
            help[i++] = arr[p1++];
        for (int j = 0; j < help.length; j++) {
            arr[L + j] = help[j];
        }
    }

    public static void mergeSort(int[] a, int L, int R){
        if(L == R)
            return ;

        int mid = L + (R - L) / 2;
        mergeSort(a, L, mid);
        mergeSort(a, mid + 1,R);
        merge(a, L, mid, R);

    }
    public static  void mergeSort(int[] a){
        if(a.length < 2 || a == null)
            return;
        mergeSort(a, 0, a.length - 1);
    }


    public static int[] getNum(int[] a){
        int[] arr = new int[50000];
        for (int i = 0; i < a.length; i++) {
            if(a[i] < 0)
                arr[-a[i]]++;
            else
                arr[a[i]]++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] a = generateRandomArray(2000000, 50000);
        mergeSort(a);
        show(a);
        int[] b = getNum(a);
        show(b);

    }


}

package test.ZuoPractice.Junior;

/**
 * @author SGN196
 * @date 2018/12/15 10:41
 */

public class quickSort {




    public static int[] partition(int[] arr, int L ,int R){

        int less = L - 1;
        int more = R;
        while(L < more)
            if(arr[L] < arr[R])
                swap(arr, ++less, L++);
            else
                if(arr[L] > arr[R])
                    swap(arr, L,--more);
                else
                    L++;
        swap(arr, more, R);
        return new int[]{less + 1, more};
    }
    public static void quickSort1(int[] arr, int L , int R){
        if(L < R){
            swap(arr, L +(int)(Math.random() * (R - L + 1)), R);
            int[] p = partition(arr, L, R);
            quickSort1(arr, L, p[0] - 1);
            quickSort1(arr, p[1] + 1, R);
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

    public static void show(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }
    }

    public static void main(String[] args) {
        int[]  a = generateRandomArray(20000, 50);
        quickSort1(a, 0, a.length - 1);
        show(a);

    }
}

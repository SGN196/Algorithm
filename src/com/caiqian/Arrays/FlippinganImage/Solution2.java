package com.caiqian.Arrays.FlippinganImage;

/**
 * @author SGN196
 * @date 2018/12/31 20:36
 */

public class Solution2 {
    public int[][] flipAndInvertImage(int[][] b) {
        for(int a[] : b){
            change(a);
        }
        if (b[0].length % 2 == 1) {
            for (int i = 0; i < b.length; i++) {
                b[i][b.length / 2] = (b[i][b.length / 2]) ^ 1;
            }
        }
        return b;
    }
    public void change(int[] a) {

        for (int i = 0; i < a.length / 2; i++) {
            swap(a, i, a.length - i - 1);
            a[i] = (a[i]) ^ 1;
            a[a.length - i - 1]  = (a[a.length - i - 1]) ^ 1;

        }
    }

    public static void show(int[][] A){
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.print(A[i][j]);
            }
            System.out.println();
        }
    }
    public static void swap(int[] a, int l, int r){
        int tmp = a[l];
        a[l] = a[r];
        a[r] = tmp;
    }

    public static void main(String[] args) {
//        int[][] A = new int[4][4];
        int A[][] = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
        int B[][] = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        show(B);
//        A = new Solution().flipAndInvertImage(A);
        B = new Solution2().flipAndInvertImage(B);
        show(B);


}


}

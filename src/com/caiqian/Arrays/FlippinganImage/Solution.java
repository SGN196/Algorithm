package com.caiqian.Arrays.FlippinganImage;

import java.util.Arrays;

/**
 * @author SGN196
 * @date 2018/12/31 19:17
 *
 * 先水平翻转    再按位取反
 */

public class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length / 2; j++) {
                swap(A, i, j, i, A[0].length - j - 1);
                if (A[i][j] == 0) {
                    A[i][j] = 1;
                } else
                    A[i][j] = 0;
                if (A[i][A[0].length - j - 1] == 0) {
                    A[i][A[0].length - j - 1] = 1;
                } else
                    A[i][A[0].length - j - 1] = 0;
            }
        }
        if (A[0].length % 2 == 1) {
            for (int i = 0; i < A.length; i++) {
                if (A[i][A[0].length / 2] == 0) {
                    A[i][A[0].length / 2] = 1;
                } else
                    A[i][A[0].length / 2] = 0;
            }
        }

        return A;
    }
    public static void swap(int[][] A, int a, int b, int x, int y){
        int tmp = A[a][b];
        A[a][b] = A[x][y];
        A[x][y] = tmp;
    }

    public static void show(int[][] A){
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.print(A[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
//        int[][] A = new int[4][4];
        int A[][] = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
        int B[][] = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        show(B);
//        A = new Solution().flipAndInvertImage(A);
        B = new Solution().flipAndInvertImage(B);
        show(B);
    }
}

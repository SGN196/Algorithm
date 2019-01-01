package test.ZuoPractice.Junior;

/**
 * @author SGN196
 * @date 2019/1/1 12:27
 * 岛问题，类似于围棋中独立存活的岛。
 */

public class Code_03_Islands {


    public static void initArray(int[][] A){
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                A[i][j] = (int)(Math.random() * 2);
            }
        }
    }
    public static void show(int[][] A){
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int getIsland(int[][] A){
        int num = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if(A[i][j] == 1){
                    num++;
                    change(A, i, j, A.length, A[0].length);
                }
            }
        }
        return num;
    }

    public static void change(int[][] A, int i, int j, int M, int N){
        if(i < 0 || j < 0 || i >= M || j >= N || A[i][j] != 1){
            return;
        }
        A[i][j] = 2;
        change(A, i + 1, j, M, N);
        change(A, i, j + 1, M, N);
        change(A, i - 1, j, M, N);
        change(A, i, j - 1, M, N);

    }

    public static void main(String[] args) {
        int rand = (int)(Math.random() * 10);
        int[][] A = new int[rand][rand];
        initArray(A);
        show(A);
        System.out.println(getIsland(A));
        show(A);


    }
}

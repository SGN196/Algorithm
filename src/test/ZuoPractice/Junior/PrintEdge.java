package test.ZuoPractice.Junior;

/**
 * @author SGN196
 * @date 2018/12/23 22:36
 * Row:行
 * Column:列
 *
 * PS:矩阵的递归（遍历）很精髓
 *
 * 1、转圈打印矩阵
 * 2、矩阵的旋转
 */

public class PrintEdge {
    public static void printEdge(int[][] m, int tR, int tC, int dR, int dC){
        if(tR == dR){
            for (int i = tC; i < dC; i++) {
                System.out.print(m[tR][i] + " ");
            }
        }else if(tC == dC){
            for (int i = tR; i < dR; i++) {
                System.out.print(m[i][tC] + " ");

            }
        }else{
            int curC = tC;
            int curR = tR;
            while(curC < dC){
                System.out.print(m[tR][curC++] + " ");
            }
            while (curR < dR){
                System.out.print(m[curR++][dC] + " ");
            }
            while (curC > tC){
                System.out.print(m[dR][curC--] + " ");
            }
            while (curR > tR){
                System.out.print(m[curR--][tC] + " ");
            }


        }
    }

    public static void spiralOrderPrint(int[][] matrix){
        int tC = 0;
        int tR = 0;
        int dR = matrix.length - 1;
        int dC = matrix[0].length  -1;
        while(tR <= dR && tC <= dC)
            printEdge(matrix, tR++, tC++, dR--, dC--);
    }

    /**
     *
     * 矩阵顺时针旋转
     *
     *
     * @param args
     */
    public static void rotate(int[][] matrix){
        int tC = 0;
        int tR = 0;
        int dC = matrix[0].length - 1;
        int dR = matrix.length - 1;
        while(tC <= dC && tR <= dR){
            rotateEdge(matrix, tR++, tC++, dR--, dC--);  //矩阵的递归
        }
    }
    public static void rotateEdge(int[][] m, int tR, int tC, int dR, int dC){
        int tmp = 0;

        for (int i = 0; i != dC - tC; i++) {
            tmp = m[tR][tC + i];
            m[tR][tC + i] = m[dR - i][tC];
            m[dR - i][tC] = m[dR][dC - i];
            m[dR][dC - i] = m[tR + i][dC];
            m[tR + i][dC] = tmp;

            
        }
    }

    public static void main(String[] args) {
        int N = 5;
        int M = 5;
        int index = 0;
        int[][] a = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                a[i][j] = index++;
            }
        }
        rotate(a);




        System.out.println(a);

    }
}

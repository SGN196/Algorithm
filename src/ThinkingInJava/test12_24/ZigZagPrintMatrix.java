package ThinkingInJava.test12_24;

/**
 * @author SGN196
 * @date 2018/12/24 10:29
 *
 * 之字型，输出矩阵
 */

public class ZigZagPrintMatrix {
    public static void printMatrixZigzag(int[][] matrix){
        int aR = 0;
        int aC = 0;
        int bR = 0;
        int bC = 0;
        int endR = matrix.length - 1;
        int endC = matrix[0].length - 1;
        boolean fromUp = false;
        while(aR != endR + 1){
            printLevel(matrix, aR, aC, bR, bC, fromUp);
            if(aC == endC)
                aR++;
            else
                aC++;
            if(bR != endR)
                bR++;
            else
                bC++;
            fromUp = !fromUp;
        }
        System.out.println();
    }

    public static void printLevel(int[][] m, int aR, int aC, int bR, int bC, boolean f){
        if(f){
            while(bC <= aC){
                System.out.print(m[aR++][aC--] + " ");
            }
        }else{

            while(aC >= bC){
                System.out.print(m[bR--][bC++] + " ");
            }
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
        printMatrixZigzag(a);



        System.out.println(a);

    }
}

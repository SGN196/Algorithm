package ThinkingInJava.test.day1_2;

/**
 * @author SGN196
 * @date 2019/1/3 19:06
 */

public class Code_07_MinPath {


    public static int walk(int[][] matrix, int i, int j){
        if(i == matrix.length - 1 && j == matrix[0].length - 1){
            return matrix[i][j];
        }
        if(i == matrix.length - 1 ){
            return matrix[i][j] + walk(matrix, i, j + 1);
        }
        if(j == matrix[0].length - 1){
            return matrix[i][j] + walk(matrix,  i + 1, j);
        }
        int right = walk(matrix, i + 1, j);
        int down = walk(matrix, i, j + 1);
        return matrix[i][j] + Math.min(right, down);  //背包问题：min该为max
    }


    public static void main(String[] args) {
        int[][] m = {{1, 3, 5, 9}, {8, 1, 3, 4}, {5, 0, 6, 1}, {8, 8, 4, 0}};
        System.out.println(walk(m,0,0));
    }
}

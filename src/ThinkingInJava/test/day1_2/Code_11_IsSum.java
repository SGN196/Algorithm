package ThinkingInJava.test.day1_2;

/**
 * @author SGN196
 * @date 2019/1/3 22:20
 */

public class Code_11_IsSum {

    public static boolean isSum(int[] arr, int i, int sum, int aim){
        if(i == arr.length){
            if(sum == aim)
                return true;
            return false;
        }
        return (isSum(arr, i + 1, sum, aim) || isSum(arr, i + 1, sum + arr[i], aim));


    }

    public static void main(String[] args) {
        int[] arr = {6,2,7,22};
        int aim = 9;
        System.out.println(isSum(arr, 0, 0, aim));
    }
}

package test.ZuoPractice.Junior;

/**
 * @author SGN196
 * @date 2018/12/18 10:58
 */

public class MaxGap {
    public static int maxGap(int[] nums){
        if(nums == null || nums.length < 2){
            return 0;
        }
        int len = nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        return 0;
    }

    public static int bucket(long num, long len, long min, long max){
        return (int) ((num - min) * len / (max - min));
    }

    public static void main(String[] args) {




    }


}

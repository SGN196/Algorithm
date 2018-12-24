package test.ZuoPractice.Junior;

/**
 * @author SGN196
 * @date 2018/12/22 16:45
 */

/**
 *
 * 给定一个数组，求如果排序之后，相邻两数的最大差值，要求时间复杂度O(N)，且要求不能用基于比较的排序
 */

public class Code_11_MaxGap {
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
        if(min == max){
            return 0;
        }
        boolean[] hasNum = new boolean[len + 1];
        int[] maxs = new int[len + 1];
        int[] mins = new int[len + 1];
        int bid = 0;
        for (int i = 0; i < len; i++) {
            bid = bucket(nums[i], len, min, max);
            mins[bid] = hasNum[bid]?Math.min(mins[bid], nums[i]) : nums[i];
            maxs[bid] = hasNum[bid]?Math.max(maxs[bid], nums[i]) : nums[i];
            hasNum[bid] = true;
        }
        int res = 0;
        int lastMax = maxs[0];
        for (int i = 1; i <= len ; i++) {
            if(hasNum[i]){
                res = Math.max(res, mins[i] - lastMax);
                lastMax = maxs[i];
            }
        }
        return res;
    }

    /**
     * (num - min) / ((max - min) / len))
     * 长度 / 每个桶所占的长度

     */
    public static int bucket(long num, long len, long min, long max){
        return (int)((num - min) * len / (max - min));
    }

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

    public static void main(String[] args) {
        int[] a = generateRandomArray(20, 50);
        System.out.println("max = " + maxGap(a));
    }
}

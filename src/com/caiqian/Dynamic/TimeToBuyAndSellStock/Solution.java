package com.caiqian.Dynamic.TimeToBuyAndSellStock;

/**
 * @author SGN196
 * @date 2019/1/14 21:30
 */

public class Solution {


    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (min > prices[i]) {
                min = prices[i];
            }
            if(max < (prices[i] - min)){
                max = prices[i] - min;
            }
        }
        return max;
    }


}

package com.caiqian.Math.DiStringMatch;

/**
 * @author SGN196
 * @date 2019/1/24 17:44
 */

public class Solution {
    public int[] diStringMatch(String S) {
        int[] A = new int[S.length() + 1];
        int a = 0;
        int b = S.length();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'D') {
                A[i] = b--;

            } else if (S.charAt(i) == 'I') {
                A[i] = a++;
            }

        }
        A[S.length()] = a;
        return A;
    }
}

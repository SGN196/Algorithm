package com.caiqian.Tree.MaxinumDepthOfBinaryTree;

/**
 * @author SGN196
 * @date 2019/1/4 17:25
 *
 * 本代码使用递归的方式来解决问题
 * 在下一个版本中可以使用迭代的方式来解决问题
 */


class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        int num1 = maxDepth(root.left);
        int num2 = maxDepth(root.right);
        return Integer.max(num1, num2) + 1;
    }


    public static void main(String[] args) {

    }
}

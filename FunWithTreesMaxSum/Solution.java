// TASK CODEWARS
// https://www.codewars.com/kata/57e5279b7cf1aea5cf000359/train/java
package pl.jakubmarjankowski.codewars.FunWithTreesMaxSum;

public class Solution {
    static int maxSum(TreeNode root) {

        if(root == null)
            return 0;

        return root.value + maxSum(root.right) > root.value + maxSum(root.left) ?
                root.value + maxSum(root.right) : root.value + maxSum(root.left);
    }
}

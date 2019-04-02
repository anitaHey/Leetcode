//Runtime: 0 ms, faster than 100.00% of Java online submissions for Path Sum.
//Memory Usage: 38.8 MB, less than 23.90% of Java online submissions for Path Sum.

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int sum){
        return count(root,0,sum);
    }
    public boolean count(TreeNode root, int num, int sum){
        if(root==null) return false;
        else if(root.left==null&& root.right == null) return sum==num+root.val;
        else return count(root.left,num+root.val,sum)||count(root.right,num+root.val,sum);
    }
}
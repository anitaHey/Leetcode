//Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Depth of Binary Tree.
//Memory Usage: 40.3 MB, less than 5.01% of Java online submissions for Maximum Depth of Binary Tree.

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
    public int maxDepth(TreeNode root) {
        if(root==null)return 0;
        return check(1,root);
    }
    public int check(int num,TreeNode a){
        if(a == null) return num-1;
        else return Math.max(check(num+1,a.left),check(num+1,a.right)); 
    }
}
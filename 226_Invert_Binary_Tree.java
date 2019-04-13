//Runtime: 0 ms, faster than 100.00% of Java online submissions for Invert Binary Tree.
//Memory Usage: 35.5 MB, less than 88.64% of Java online submissions for Invert Binary Tree.

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
    public TreeNode invertTree(TreeNode root) {
        change(root);
        return root;
    }
    public void change(TreeNode root){
        if(root!=null){
            TreeNode tem = root.left;
            root.left = root.right;
            root.right = tem;
            
            change(root.left);
            change(root.right);
        }
    }
}
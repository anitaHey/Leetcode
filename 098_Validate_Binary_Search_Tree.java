//Runtime: 0 ms, faster than 100.00% of Java online submissions for Validate Binary Search Tree.
//Memory Usage: 38 MB, less than 77.51% of Java online submissions for Validate Binary Search Tree.

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
    public boolean isValidBST(TreeNode root) {
        return check(root,null,null);
    }
    
    public boolean check(TreeNode root,Integer max,Integer min){
        if(root==null)   return true;
        
        if(max != null && root.val>=max) return false;
        if(min != null && root.val<=min) return false;
        
        return check(root.left,root.val,min) && check(root.right,max,root.val);
    }
}
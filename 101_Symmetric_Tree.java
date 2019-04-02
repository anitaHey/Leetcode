//Runtime: 0 ms, faster than 100.00% of Java online submissions for Symmetric Tree.
//Memory Usage: 38.5 MB, less than 45.42% of Java online submissions for Symmetric Tree.

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
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return check(root.left,root.right);
    }
    public boolean check(TreeNode a,TreeNode b){
        if(a==null && b==null) return true;
        else if(!(a!=null && b!=null)) return false;
        else return (a.val==b.val) && check(a.left,b.right) && check(a.right,b.left);
    }
}
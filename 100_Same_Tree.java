//Runtime: 0 ms, faster than 100.00% of Java online submissions for Same Tree.
//Memory Usage: 35.5 MB, less than 96.28% of Java online submissions for Same Tree.

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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return check(p,q);
    }
    public boolean check(TreeNode p, TreeNode q){
        boolean ans;
        if(p == null && q == null) return true;
        else if(!(p != null && q != null)) return false;
        else return (p.val == q.val) && check(p.left,q.left)&& check(p.right,q.right);
    }
}
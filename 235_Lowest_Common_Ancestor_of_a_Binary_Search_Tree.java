//Runtime: 4 ms, faster than 100.00% of Java online submissions for Lowest Common Ancestor of a Binary Search Tree.
//Memory Usage: 35.4 MB, less than 9.30% of Java online submissions for Lowest Common Ancestor of a Binary Search Tree.

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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        else if(root.val>p.val && root.val>q.val)
            return lowestCommonAncestor(root.left,p,q);
        else if(root.val<p.val && root.val<q.val)
            return lowestCommonAncestor(root.right,p,q);
        else
            return root;
    }
}
//Runtime: 5 ms, faster than 100.00% of Java online submissions for Lowest Common Ancestor of a Binary Tree.
//Memory Usage: 33.8 MB, less than 75.52% of Java online submissions for Lowest Common Ancestor of a Binary Tree.

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
    TreeNode ans;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ans = null;
        search(root,p,q);
        return ans;
    }
    public boolean search(TreeNode root, TreeNode p, TreeNode q){
        if(root!=null){
            int left = (search(root.left,p,q))?1:0;
            int right = (search(root.right,p,q))?1:0;
            int mid = (root==p||root==q)?1:0;
            if(left+right+mid>=2) ans = root;
            
            return (left+right+mid>0);
        }
        return false;
    }
}
/**
 * Runtime: 1 ms, faster than 98.52% of Java online submissions for Balanced Binary Tree.
 * Memory Usage: 36.6 MB, less than 100.00% of Java online submissions for Balanced Binary Tree.
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int left_depth = countDepth(root.left);
        int right_depth = countDepth(root.right);
        
        return (Math.abs(left_depth-right_depth) <= 1) && isBalanced(root.right) && isBalanced(root.left);
    }
    
    public int countDepth(TreeNode root){
        if(root == null) return 1;
        return 1 + Math.max(countDepth(root.left),countDepth(root.right));
    }
}

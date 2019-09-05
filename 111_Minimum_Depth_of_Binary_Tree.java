/**
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Minimum Depth of Binary Tree.
 * Memory Usage: 39.1 MB, less than 98.44% of Java online submissions for Minimum Depth of Binary Tree.
 */
class Solution {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null) return 1 + minDepth(root.right);
        if(root.right == null) return 1 + minDepth(root.left);
        
        return 1 + Math.min(minDepth(root.left),minDepth(root.right));
    }
}

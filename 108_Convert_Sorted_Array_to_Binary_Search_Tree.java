//Runtime: 0 ms, faster than 100.00% of Java online submissions for Convert Sorted Array to Binary Search Tree.
//Memory Usage: 37.5 MB, less than 78.60% of Java online submissions for Convert Sorted Array to Binary Search Tree.

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
    public TreeNode sortedArrayToBST(int[] nums) {
        return tree(nums, 0, nums.length - 1);
    }
    
    public TreeNode tree(int nums[], int left, int right) {
        if(left > right) return null;
        
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = tree(nums, left, mid - 1);
        root.right = tree(nums, mid + 1, right);
        
        return root;
    }
}
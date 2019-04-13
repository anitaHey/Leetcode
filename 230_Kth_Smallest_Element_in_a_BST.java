//Runtime: 1 ms, faster than 42.42% of Java online submissions for Kth Smallest Element in a BST.
//Memory Usage: 38.6 MB, less than 62.98% of Java online submissions for Kth Smallest Element in a BST.

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
    public int kthSmallest(TreeNode root, int k) {
        if(root==null) return 0;
        List<Integer> num = new ArrayList<>();   
        search(num,root);
        return num.get(k-1);
    }
    public void search(List<Integer> num,TreeNode root){
        if(root!=null){
            search(num,root.left);
            num.add(root.val);
            search(num,root.right);
        }
    }
}

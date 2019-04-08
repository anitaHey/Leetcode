//Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Tree Preorder Traversal.
//Memory Usage: 36.2 MB, less than 34.50% of Java online submissions for Binary Tree Preorder Traversal.

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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        preorder(ans,root);
        return ans;
    }
    public void preorder(List<Integer> ans,TreeNode root){
        if(root!=null){
            ans.add(root.val);
            preorder(ans,root.left);
            preorder(ans,root.right);
        }
    }
}
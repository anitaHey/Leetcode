//Runtime: 0 ms, faster than 100.00% of Java online submissions for Count Complete Tree Nodes.
//Memory Usage: 39.5 MB, less than 91.14% of Java online submissions for Count Complete Tree Nodes.

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
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        else return search(root);
    }
    public int search(TreeNode root){
        if(root!=null){
            return search(root.left)+search(root.right)+1;
        }else return 0;
    }
}
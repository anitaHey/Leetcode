//Runtime: 1 ms, faster than 100.00% of Java online submissions for Binary Tree Paths.
//Memory Usage: 37.4 MB, less than 62.66% of Java online submissions for Binary Tree Paths.

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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        if(root==null) return ans;
        find(root,"",ans);
        return ans;
    }
    public void find(TreeNode root,String tem,List<String> ans){
        if(root.right==null&&root.left==null) ans.add(tem+root.val);
        if(root.left!=null) find(root.left,tem+root.val+"->",ans);
        if(root.right!=null) find(root.right,tem+root.val+"->",ans);
    }
}
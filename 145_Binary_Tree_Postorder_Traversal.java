//Runtime: 1 ms, faster than 45.52% of Java online submissions for Binary Tree Postorder Traversal.
//Memory Usage: 36.1 MB, less than 56.99% of Java online submissions for Binary Tree Postorder Traversal.
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(stack.size()!=0){
            TreeNode cur = stack.pop();
            ans.add(0,cur.val);
            if(cur.left!=null) stack.push(cur.left);
            if(cur.right!=null) stack.push(cur.right);    
        }
        return ans;
    }
}
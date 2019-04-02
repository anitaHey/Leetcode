//Runtime: 1 ms, faster than 74.74% of Java online submissions for Binary Tree Level Order Traversal.
//Memory Usage: 37.5 MB, less than 12.58% of Java online submissions for Binary Tree Level Order Traversal.

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        
        if(root==null) return ans;
        queue.offer(root);
        
        while(queue.size()!=0){
            int num = queue.size();
            List<Integer> tem = new ArrayList<>();
            for(int a = 0;a<num;a++){
                if(queue.peek().left!=null) queue.offer(queue.peek().left);
                if(queue.peek().right!=null) queue.offer(queue.peek().right);
                
                tem.add(queue.poll().val);
            }
            ans.add(tem);
        }
        return ans;
    }
}
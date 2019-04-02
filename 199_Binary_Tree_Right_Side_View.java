//Runtime: 1 ms, faster than 74.05% of Java online submissions for Binary Tree Right Side View.
//Memory Usage: 37.4 MB, less than 5.67% of Java online submissions for Binary Tree Right Side View.

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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root==null) return ans;
        queue.offer(root);
        while(queue.size()!=0){
            int num = queue.size();
            ArrayList<Integer> tem = new ArrayList<>();
            for(int a = 0;a<num;a++){
                if(queue.peek().left!=null)queue.offer(queue.peek().left);
                if(queue.peek().right!=null)queue.offer(queue.peek().right);
                tem.add(queue.poll().val);
            }
            ans.add(tem.get(tem.size()-1));
        }
        return ans;
    }
}
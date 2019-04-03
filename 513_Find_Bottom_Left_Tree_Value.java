//Runtime: 3 ms, faster than 85.59% of Java online submissions for Find Bottom Left Tree Value.
//Memory Usage: 38.3 MB, less than 78.24% of Java online submissions for Find Bottom Left Tree Value.

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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if(root==null) return 0;
        queue.offer(root);
        ArrayList<Integer> tem = new ArrayList<>();;
        while(queue.size()!=0){
            int num = queue.size();
            tem.clear();
            for(int a = 0;a<num;a++){
                if(queue.peek().left!=null)queue.offer(queue.peek().left);
            	if(queue.peek().right!=null)queue.offer(queue.peek().right);
                tem.add(queue.poll().val);
            }
        }
        return tem.get(0);
    }
}
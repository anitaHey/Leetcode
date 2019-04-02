//Runtime: 1 ms, faster than 74.36% of Java online submissions for Binary Tree Zigzag Level Order Traversal.
//Memory Usage: 37.1 MB, less than 60.72% of Java online submissions for Binary Tree Zigzag Level Order Traversal.

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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Deque<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        int line = 0;
        if(root==null) return ans;
        queue.offerFirst(root);
        while(queue.size()!=0){
            int num = queue.size();
            List<Integer> tem = new ArrayList<>();
            for(int a = 0;a<num;a++){
                if(line % 2 == 0){
                   if(queue.peekFirst().left!=null) queue.offerLast(queue.peekFirst().left);
                    if(queue.peekFirst().right!=null) queue.offerLast(queue.peekFirst().right);
                    tem.add(queue.removeFirst().val);
                }else{
                    if(queue.peekLast().right!=null) queue.offerFirst(queue.peekLast().right);
                    if(queue.peekLast().left!=null) queue.offerFirst(queue.peekLast().left); 
                    tem.add(queue.removeLast().val);
                }
            }
            line++;
            ans.add(tem);
        }
        return ans;
    }
}
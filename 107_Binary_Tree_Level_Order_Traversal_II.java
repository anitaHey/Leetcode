/**
 * Runtime: 1 ms, faster than 99.51% of Java online submissions for Binary Tree Level Order Traversal II.
 * Memory Usage: 36.7 MB, less than 100.00% of Java online submissions for Binary Tree Level Order Traversal II.
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Queue<TreeNode> tem = new LinkedList<TreeNode>();
        if(root!=null) tem.add(root);
        
        while(tem.size() > 0){
            List<Integer> list = new ArrayList<Integer>();
            int length = tem.size();
            for(int a = 0; a < length; a++){
                if(tem.peek().left!=null) tem.add(tem.peek().left);
                if(tem.peek().right!=null) tem.add(tem.peek().right);
                
                list.add(tem.poll().val);
            }
            ans.add(0,list);
        }
        return ans;
    }
}
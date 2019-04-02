//Runtime: 2 ms, faster than 35.32% of Java online submissions for Path Sum II.
//Memory Usage: 41.6 MB, less than 20.61% of Java online submissions for Path Sum II.

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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> ans = new ArrayList<>();
        check(ans,new ArrayList<>(),root,sum,0);
        return ans;
    }
    public void check(List<List<Integer>> ans,List<Integer> tem,TreeNode root, int sum,int num){
        if(root!=null){
            num += root.val;
            tem.add(root.val);
            if(root.left==null && root.right == null && (num == sum)) ans.add(tem);
            check(ans,new ArrayList<>(tem),root.left,sum,num);
            check(ans,new ArrayList<>(tem),root.right,sum,num);
        }
    }
}
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Sum Root to Leaf Numbers.
//Memory Usage: 36.6 MB, less than 88.12% of Java online submissions for Sum Root to Leaf Numbers.

class Solution {
    public int sumNumbers(TreeNode root) {
        if(root==null) return 0;
        return sum(0,root);
    }
    public int sum(int num,TreeNode root){
        if(root==null) return 0;
        num = num*10 + root.val;
        if(root.left==null && root.right==null) return num;
        return sum(num,root.left)+sum(num,root.right);
    }
}
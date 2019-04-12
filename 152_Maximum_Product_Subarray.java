//Runtime: 2 ms, faster than 50.17% of Java online submissions for Maximum Product Subarray.
//Memory Usage: 37.5 MB, less than 36.81% of Java online submissions for Maximum Product Subarray.

class Solution {
    public int maxProduct(int[] nums) {
        if(nums==null) return 0;
        int[] max = new int[nums.length];
        int[] min = new int[nums.length];
        int ans = nums[0];
        max[0] = nums[0];
        min[0] = nums[0];
        for(int a = 1;a<nums.length;a++){
            max[a] = Math.max(Math.max(max[a-1]*nums[a],min[a-1]*nums[a]),nums[a]);
            min[a] = Math.min(Math.min(max[a-1]*nums[a],min[a-1]*nums[a]),nums[a]);
            ans = Math.max(ans,max[a]);
        }
        return ans;
    }
}
//Runtime: 1 ms, faster than 99.45% of Java online submissions for Maximum Subarray.
//Memory Usage: 39.1 MB, less than 85.46% of Java online submissions for Maximum Subarray.

class Solution {
    public int maxSubArray(int[] nums) {
        int num = 0;
        int ans = nums[0];
        for(int a : nums){
            num = (num>0)?num+a:a;
            ans = Math.max(num,ans);
        }
        return ans;
    }
}
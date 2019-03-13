//Runtime: 1 ms, faster than 100.00% of Java online submissions for Product of Array Except Self.
//Memory Usage: 40.9 MB, less than 83.01% of Java online submissions for Product of Array Except Self.

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int sum = 1;
        int zero = 0;
        int[] ans = new int[nums.length];
        for(int a = 0;a<nums.length;a++){
            if(nums[a]!=0)
                sum = sum * nums[a];
            else
                zero++;
        }
        for(int a = 0;a<nums.length;a++){
            if(zero>1)
                ans[a] = 0;
            else if(zero == 1)
                if(nums[a]==0)
                    ans[a] = sum;
                else
                    ans[a]=0;
            else
                ans[a] = sum/nums[a];
        }
        return ans;
    }
}
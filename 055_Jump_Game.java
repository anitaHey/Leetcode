/**
 * Runtime: 1 ms, faster than 99.18% of Java online submissions for Jump Game.
 * Memory Usage: 36.5 MB, less than 100.00% of Java online submissions for Jump Game.
 */
class Solution {
    public boolean canJump(int[] nums) {
        int count = 0;
        for(int a = 0;a<nums.length;a++){
            if(count < a) return false;    
            count = Math.max(nums[a]+a,count);
        }
        
        return true;
    }
}
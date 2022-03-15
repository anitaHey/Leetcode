// Runtime: 0 ms, faster than 100.00% of Java online submissions for Search Insert Position.
// Memory Usage: 44 MB, less than 13.88% of Java online submissions for Search Insert Position.

class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;
        
        while(left < right) {
            int mid = (left+right)/2;
            if(nums[mid] < target) {
                left = mid + 1;
            } else if(nums[mid] > target) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        
        if(nums[left] < target) {
            return left + 1;
        } else {
            return left;
        }
    }
}
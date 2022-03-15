// Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Search.
// Memory Usage: 54.3 MB, less than 40.56% of Java online submissions for Binary Search.

class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;
        while(left <= right) {
            int mid = (left + right)/2;
            if(nums[mid] < target) {
                left = mid + 1;
            } else if(nums[mid] > target) {
                right = mid -1;
            } else {
                return mid;
            }
        }
        
        return -1;
    }
}

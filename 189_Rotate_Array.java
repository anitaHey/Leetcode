//Runtime: 0 ms, faster than 100.00% of Java online submissions for Rotate Array.
//Memory Usage: 38.1 MB, less than 35.58% of Java online submissions for Rotate Array.

class Solution {
    public void rotate(int[] nums, int k) {
        int length = (k < nums.length)?k : k % (nums.length) ;
        reverse(nums,0,nums.length-1-length);
        reverse(nums,nums.length-length,nums.length-1);
        reverse(nums,0,nums.length-1);
    }
    public void reverse(int[] nums,int start,int end){
        while(start<end){
            int tem = nums[start];
            nums[start] = nums[end];
            nums[end] = tem;
            start++;
            end--;
        }
    }
}
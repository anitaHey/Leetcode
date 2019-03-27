//Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Element.
//Memory Usage: 37.3 MB, less than 96.63% of Java online submissions for Remove Element.

class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for(int a =0;a<nums.length;a++){
            if(nums[a]!=val){
                nums[count] = nums[a];
                count++;
            }
        }
        return count;
    }
}
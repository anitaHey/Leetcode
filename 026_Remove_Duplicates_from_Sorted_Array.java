//Runtime: 1 ms, faster than 100.00% of Java online submissions for Remove Duplicates from Sorted Array.
//Memory Usage: 41.3 MB, less than 74.48% of Java online submissions for Remove Duplicates from Sorted Array.

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int length = 0;
        for(int a =1;a<nums.length;a++){
            if(nums[length] != nums[a]){
                length++;
                nums[length] = nums[a];
            }
        }
        return length+1;
    }
}

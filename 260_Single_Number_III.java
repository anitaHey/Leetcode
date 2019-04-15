//Runtime: 2 ms, faster than 42.56% of Java online submissions for Single Number III.
//Memory Usage: 39.9 MB, less than 8.82% of Java online submissions for Single Number III.

class Solution {
    public int[] singleNumber(int[] nums) {
        int[] ans = new int[2];
        Arrays.sort(nums);
        for(int a = 0;a<nums.length;a++){
            if(a!=nums.length-1 && nums[a]==nums[a+1]){
                a++;
            }else{
                if(ans[0]==0) ans[0]=nums[a];
                else ans[1]=nums[a]; 
            } 
        }
        return ans;
    }
}
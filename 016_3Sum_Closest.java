//Runtime: 5 ms, faster than 100.00% of Java online submissions for 3Sum Closest.
//Memory Usage: 37.9 MB, less than 50.96% of Java online submissions for 3Sum Closest.

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = nums[0]+nums[1]+nums[2];
        for(int first = 0;first<nums.length-2;first++){
            int left=first+1,right=nums.length-1;
            while(left<right){
                int tem = nums[first] + nums[left]+nums[right];
                ans = (Math.abs(ans-target)<=Math.abs(tem-target))?ans:tem;
                if(tem-target>0)right--;
                else if(tem-target<0)left++;
                else return tem;
            }
        }
        return ans;
    }
}
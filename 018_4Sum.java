//Runtime: 29 ms, faster than 74.03% of Java online submissions for 4Sum.
//Memory Usage: 39 MB, less than 83.55% of Java online submissions for 4Sum.

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int start1 = 0;start1<nums.length-3;start1++){
            for(int start2 = start1+1;start2<nums.length-2;start2++){
                int left =  start2+1,right = nums.length-1;
                while(left<right){
                    int tem = nums[start1]+nums[start2]+nums[left]+nums[right];
                    if(tem>target)right--;
                    else if(tem<target)left++;
                    else{
                        List<Integer> num = new ArrayList<>();
                        num.add(nums[start1]);
                        num.add(nums[start2]);
                        num.add(nums[left]);
                        num.add(nums[right]);
                        left++;
                        right--;
                        if(!ans.contains(num))
                            ans.add(num);
                    }
                }
            }
        }
        return ans;
    }
}
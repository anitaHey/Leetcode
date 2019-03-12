//Runtime: 49 ms, faster than 57.36% of Java online submissions for 3Sum.
//Memory Usage: 48.5 MB, less than 67.23% of Java online submissions for 3Sum.

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> re = new ArrayList<>();
        
        Arrays.sort(nums);
        for(int a = 0;a<nums.length-2;a++){
            if(a>=1&&nums[a]==nums[a-1])continue;
            int start = a+1,end=nums.length-1;
            while(start < end){
                if(start!=a+1&&nums[start]==nums[start-1]){
                    start++;continue;
                }
                if(end!=nums.length-1&&nums[end]==nums[end+1]){
                    end--;continue;
                }
                int con = nums[start]+nums[end];
                if(con+nums[a]>0)end--;
                else if(con+nums[a]<0)start++;
                else{
                    
                    List<Integer> arr = new ArrayList<>();
                    arr.add(nums[a]);arr.add(nums[start]);arr.add(nums[end]);
                    re.add(arr);
                    start++;end--;
                }
            }
        }
        return re;
    }
}
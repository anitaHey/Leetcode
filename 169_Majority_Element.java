//Runtime: 16 ms, faster than 23.03% of Java online submissions for Majority Element.
//Memory Usage: 41.2 MB, less than 29.12% of Java online submissions for Majority Element.

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> count = new HashMap<>();
        int max = 0;
        for(int a = 0;a<nums.length;a++){
            if(count.containsKey(nums[a])){
                int tem = count.get(nums[a]);
                max = (max==0)?nums[a]:((count.get(max)>tem+1)?max:nums[a]);
                count.put(nums[a],tem+1);
            }else{
                count.put(nums[a],1);
                if(max==0) max = nums[a];
            }
        }
        return max;
    }
}
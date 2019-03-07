//Runtime: 3 ms, faster than 99.58% of Java online submissions for Two Sum.
//Memory Usage: 39.2 MB, less than 22.04% of Java online submissions for Two Sum.

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int a = 0;a<nums.length;a++){
            map.put(nums[a],a);
        }
        for(int a = 0;a<nums.length;a++){
            int tem = target - nums[a];
            if(map.containsKey(tem) && map.get(tem) != a)
                return new int[] {a,map.get(tem)};
        }
        return null;
    }
}
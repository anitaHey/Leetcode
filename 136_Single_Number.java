//Runtime: 8 ms, faster than 25.28% of Java online submissions for Single Number.
//Memory Usage: 40.4 MB, less than 45.15% of Java online submissions for Single Number.

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            if(map.containsKey(n)){
                map.put(n,2);
            }else{
                map.put(n,1);
            }
        }
        for(int key : map.keySet())
            if(map.get(key)==1) return key;
        return -1;
    }
}
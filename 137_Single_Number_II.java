//Runtime: 5 ms, faster than 27.40% of Java online submissions for Single Number II.
//Memory Usage: 38.9 MB, less than 7.78% of Java online submissions for Single Number II.

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
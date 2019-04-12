//Runtime: 0 ms, faster than 100.00% of Java online submissions for Two Sum II - Input array is sorted.
//Memory Usage: 38.2 MB, less than 57.44% of Java online submissions for Two Sum II - Input array is sorted.

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0,right=numbers.length-1;
        int[] ans = new int[2];
        while(left<right){
            int tem = numbers[left]+numbers[right];
            if(tem<target) left++;
            else if(tem>target) right--;
            else{
                ans[0]=left+1;
                ans[1]=right+1;
                break;
            }
        }
        return ans;
    }
}
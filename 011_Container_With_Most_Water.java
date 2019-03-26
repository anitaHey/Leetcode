//Runtime: 2 ms, faster than 100.00% of Java online submissions for Container With Most Water.
//Memory Usage: 40.7 MB, less than 14.04% of Java online submissions for Container With Most Water.

class Solution {
    public int maxArea(int[] height) {
        int max = 0,left=0,right=height.length-1;
        while(left<right){
            int min = Math.min(height[left],height[right]);
            max = Math.max(max,min*(right-left));
            if(min==height[left])
                left++;
            else
                right--;
        }
        return max;
    }
}
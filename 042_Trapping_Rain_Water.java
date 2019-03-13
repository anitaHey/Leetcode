//Runtime: 8 ms, faster than 98.45% of Java online submissions for Trapping Rain Water.
//Memory Usage: 40.4 MB, less than 16.65% of Java online submissions for Trapping Rain Water.

public class Solution {
    public int trap(int[] height) {
        int num = 0;
        int ans = 0;
        int[] arr = new int[height.length];
        for(int a = 0;a<height.length;a++){
            arr[a] = num;
            num = Math.max(num,height[a]);
        }
        num = 0;
        for(int a = height.length-1;a>=0;a--){
            arr[a] = Math.min(arr[a],num);
            num = Math.max(num,height[a]);
            if(arr[a]>height[a]) ans = ans+arr[a]-height[a];
        }
        return ans;
    }
}

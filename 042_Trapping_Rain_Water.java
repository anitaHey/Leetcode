//Runtime: 1 ms, faster than 99.96% of Java online submissions for Trapping Rain Water.
//Memory Usage: 39 MB, less than 80.90% of Java online submissions for Trapping Rain Water.

public class Solution {
    public int trap(int[] height) {
        int num = 0;
        int ans = 0;
        int[] array = new int[height.length];
        for(int a = 0;a<height.length;a++){
            num = Math.max(num,height[a]);
            array[a] = num;
        }
        num = 0;
        for(int a = height.length-1;a>=0;a--){
            array[a] = Math.min(num,array[a]);
            num = Math.max(num,height[a]);
            if(array[a]>height[a]) ans+=array[a]-height[a];
        }
        return ans;
    }
}

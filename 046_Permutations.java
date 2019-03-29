//Runtime: 1 ms, faster than 99.99% of Java online submissions for Permutations.
//Memory Usage: 38.6 MB, less than 48.61% of Java online submissions for Permutations.

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        for(int b = 0;b<nums.length;b++) arr.add(nums[b]);
        ans.add(arr);
        
        int length = 1;
        for(int a = 2;a<=nums.length;a++) length*=a;
        for(int a = 0;a<length-1;a++){
            int tem = 0;
            for(int b = nums.length-2;b>=0;b--){
                if(b==0||nums[b]<nums[b+1]){
                    tem = b;
                    break;
                }
            }
            for(int b = nums.length-1;b>=tem+1;b--){
                if(nums[b]>nums[tem]){
                    swap(nums,b,tem);
                    break;
                }
            }
            int left = tem+1,right = nums.length-1;
            while(left<right){
                if(nums[left]>nums[right]) swap(nums,left++,right--);
            }
            arr = new ArrayList<>();
            for(int b = 0;b<nums.length;b++) arr.add(nums[b]);
            ans.add(arr);
        }
        
        return ans;
    }
    public void swap(int[] nums,int a,int b){
        int tem = nums[a];
        nums[a] = nums[b];
        nums[b] = tem;
    }
}
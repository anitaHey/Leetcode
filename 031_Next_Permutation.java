//Runtime: 1 ms, faster than 99.97% of Java online submissions for Next Permutation.
//Memory Usage: 42.9 MB, less than 5.04% of Java online submissions for Next Permutation.

class Solution {
    public void nextPermutation(int[] nums) {
        int min = 0;
        for(int a = nums.length-2;a>=0;a--){
            if(a==0||nums[a+1]>nums[a]){
                min = a;
                break;
            }
        }
        int left = min+1,right = nums.length-1;
        for(int a = nums.length-1;a>min;a--){
            if(nums[a]>nums[min]){
                swap(nums,a,min);
                break;
            }
            if(a == min+1){
               swap(nums,min,nums.length-1);
                right = nums.length-2;
            }
        }
        
        while(left<right && nums[left]>nums[right]){
            swap(nums,left++,right--);
        }
    }
    public void swap(int[] nums,int a,int b){     
        int tem = nums[a];
        nums[a] = nums[b];
        nums[b] = tem;
    }
}
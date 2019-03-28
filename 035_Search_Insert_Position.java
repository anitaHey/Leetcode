//Runtime: 0 ms, faster than 100.00% of Java online submissions for Search Insert Position.
//Memory Usage: 39.8 MB, less than 5.03% of Java online submissions for Search Insert Position.

class Solution {
    public int searchInsert(int[] nums, int target) {
        int ans = 0;
        return search(nums,target,ans,0,nums.length-1);
    }
    public int search(int[] nums, int target,int ans,int left,int right){
        int mid = (left<right)?(left+right)/2:left;
        if(nums[mid]==target){
            ans = mid;
        }else if(nums[mid]>target){
            if(left<right)
                ans = search(nums,target,ans,left,mid-1);
            else
                ans = mid;
        }else{
            if(left<right)
                ans = search(nums,target,ans,mid+1,right);
            else
               ans = mid+1;
        }
        return ans;
    }
}
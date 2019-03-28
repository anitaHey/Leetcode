//Runtime: 0 ms, faster than 100.00% of Java online submissions for Find First and Last Position of Element in Sorted Array.
//Memory Usage: 44.1 MB, less than 5.19% of Java online submissions for Find First and Last Position of Element in Sorted Array.

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        if(nums.length==0) return ans;
        search(nums,ans,target,0,nums.length-1);
        return ans;
    }
    public void search(int[] nums,int[] ans,int target,int left,int right){
            int mid = (left<right)?(left+right)/2:left;
            if(nums[mid] == target){
                if(ans[0]== -1){
                    ans[0] = mid;
                    ans[1] = mid;
                }else{
                    ans[0]=(mid<ans[0])?mid:ans[0];
                    ans[1]=(mid>ans[1])?mid:ans[1];
                }
                if(left<right){
                    search(nums,ans,target,left,mid-1);
                    search(nums,ans,target,mid+1,right);
                }
            }else if(nums[mid] < target && left<right){
                search(nums,ans,target,mid+1,right);
            }else if(nums[mid] > target && left<right){
                search(nums,ans,target,left,mid-1);
            }
    }
}
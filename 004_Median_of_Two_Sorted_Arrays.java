//Runtime: 23 ms, faster than 99.58% of Java online submissions for Median of Two Sorted Arrays.
//Memory Usage: 48.4 MB, less than 84.52% of Java online submissions for Median of Two Sorted Arrays.

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length+nums2.length;
        boolean count = (length%2 == 0)?true:false;
        length = length/2;
        int left=0,right=0;
        int[] small = new int[2];
        for(int a = 0;a<=length;a++){
            if(left<nums1.length){
                small[0] = nums1[left];
                 if(right<nums2.length&&nums2[right]<small[0])small[0] = nums2[right++];
                else left++;
            }else{
                small[0] = nums2[right++];
            }
            if(a == length-1)if(count)small[1]=small[0];
        }
        if(count)
            return (double)(small[0]+small[1])/2;
        else
            return (double)small[0];
    }
}
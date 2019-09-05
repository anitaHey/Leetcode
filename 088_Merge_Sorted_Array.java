/**
 * First solution
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Sorted Array.
 * Memory Usage: 36.1 MB, less than 100.00% of Java online submissions for Merge Sorted Array.
 */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int num = m + n - 1;
        m--;
        n--;
        while( m >= 0 && n >= 0){
            nums1[num--] = (nums1[m]>nums2[n])? nums1[m--]:nums2[n--]; 
        }
        while(n >= 0){
            nums1[num--] = nums2[n--];
        }
    }
}

/**
 * Second solution
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Sorted Array.
 * Memory Usage: 36.5 MB, less than 100.00% of Java online submissions for Merge Sorted Array.
 */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2,0,nums1,m,n);
        Arrays.sort(nums1);
    }
}

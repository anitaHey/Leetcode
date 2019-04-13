//Runtime: 2 ms, faster than 91.42% of Java online submissions for Power of Two.
//Memory Usage: 32.4 MB, less than 100.00% of Java online submissions for Power of Two.

class Solution {
    public boolean isPowerOfTwo(int n) {
        int count = 0;
        while(Math.pow(2,count)<=n){
            if(Math.pow(2,count)==n) return true;
            else count++;
        }
        return false;
    }
}
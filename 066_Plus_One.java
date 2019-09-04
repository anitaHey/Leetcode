/**
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Plus One.
 * Memory Usage: 35.1 MB, less than 97.58% of Java online submissions for Plus One.
 */
class Solution {
    public int[] plusOne(int[] digits) {
        boolean plus = true;
        for(int a = digits.length-1; a>=0 ; a--){
            if(plus){
                if(digits[a] == 9){
                    digits[a] = 0;
                    plus = true;
                }else{
                    digits[a]++;
                    plus = false;
                }
            }
        }
        if(plus){
            int[] ans = new int[digits.length+1];
            ans[0] = 1;
            System.arraycopy(digits,0,ans,1,digits.length);
            
            return ans;
        }
        
        return digits;
    }
}
//Runtime: 72 ms, faster than 97.34% of Java online submissions for Palindrome Number.
//Memory Usage: 40.6 MB, less than 42.06% of Java online submissions for Palindrome Number.

class Solution {
    public boolean isPalindrome(int x) {
        String input = String.valueOf(x);
        int length = input.length();
        boolean ans = true;
        for(int a = 0;a <length/2;a++){
            if(input.charAt(a)!=input.charAt(length-1-a)){
                ans = false;
                break;
            }
        }
        return ans;
    }
}
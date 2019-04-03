//Runtime: 4 ms, faster than 83.79% of Java online submissions for Valid Palindrome.
//Memory Usage: 39 MB, less than 26.79% of Java online submissions for Valid Palindrome.

class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0,right = s.length()-1;
        while(left<right){
            if(!isValid(s.charAt(left))) left++;
            else if(!isValid(s.charAt(right))) right--;
            else{
                if(s.charAt(left)!=s.charAt(right)) return false;
                left++;right--;
            }
        }
        return true;
    }
    public boolean isValid(char tem){
        return (tem>='a'&&tem<='z')||(tem>='0'&&tem<='9');
    }
}
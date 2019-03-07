//Runtime: 20 ms, faster than 62.44% of Java online submissions for Longest Palindromic Substring.
//Memory Usage: 38.8 MB, less than 32.50% of Java online submissions for Longest Palindromic Substring.

class Solution {
    public String longestPalindrome(String s) {
        int length =0;
        String word=(s.length()==0)?"":String.valueOf(s.charAt(0));
        for(int a = 0;a<s.length()-1;a++){
            if(s.charAt(a+1)==s.charAt(a)){
                String[] ans = check(s,a,a+1); 
                if(length<Integer.valueOf(ans[0])){
                    length = Integer.valueOf(ans[0]);
                    word = ans[1];
                }
            }
            if(a!=0){
                if(s.charAt(a+1)==s.charAt(a-1)){
                    String[] ans = check(s,a-1,a+1);
                    if(length<Integer.valueOf(ans[0])){
                        length = Integer.valueOf(ans[0]);
                        word = ans[1];
                    }
                } 
            }
        }
        return word;
    }
    
    public String[] check(String s,int left,int right){
        while(left>=0 && right<=s.length()-1)
            if(s.charAt(left) != s.charAt(right)) break;
            else{
                left--;
                right++;
            }
        String length =String.valueOf(right - left - 1);
        String word = s.substring(left+1,right);
        return new String[] {length,word};
    }
}
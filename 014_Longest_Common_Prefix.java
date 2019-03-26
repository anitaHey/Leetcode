//Runtime: 0 ms, faster than 100.00% of Java online submissions for Longest Common Prefix.
//Memory Usage: 38.5 MB, less than 25.20% of Java online submissions for Longest Common Prefix.

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String ans = strs[0];
        for(int a = 1;a<strs.length;a++){
            while(strs[a].indexOf(ans)!=0)
                ans = ans.substring(0,ans.length()-1);
            if(ans.length() == 0) return "";
        }
        return ans;
    }
}
//Runtime: 1 ms, faster than 96.80% of Java online submissions for Length of Last Word.
//Memory Usage: 37.1 MB, less than 21.05% of Java online submissions for Length of Last Word.

class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length()==0) return 0;
        String[] split = s.split(" ");
        int ans = (split.length==0)?0:split[split.length-1].length();
        return ans;
    }
}
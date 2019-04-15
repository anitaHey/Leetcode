//Runtime: 3 ms, faster than 90.15% of Java online submissions for Valid Anagram.
//Memory Usage: 38.1 MB, less than 70.04% of Java online submissions for Valid Anagram.

class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count = new int[26];
        for(int a = 0;a<s.length();a++)
            count[(int)s.charAt(a)-97]++;
        for(int a = 0;a<t.length();a++)
            count[(int)t.charAt(a)-97]--;
        for(int a = 0;a<26;a++)
            if(count[a]!=0) return false;
        return true;
    }
}
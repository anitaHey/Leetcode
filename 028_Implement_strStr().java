//Runtime: 4 ms, faster than 63.59% of Java online submissions for Implement strStr().
//Memory Usage: 38.6 MB, less than 29.59% of Java online submissions for Implement strStr().

class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()==0&&needle.length()==0) return 0;
       for(int a = 0;a<haystack.length();a++){
           for(int b = 0;b<=needle.length();b++){
               if(b==needle.length()) return a;
               if(a+b==haystack.length()) return -1;
               if(haystack.charAt(a+b)!=needle.charAt(b)) break;
           }
       }
        return -1;
    }
}
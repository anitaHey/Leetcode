//Runtime: 19 ms, faster than 92.81% of Java online submissions for Longest Substring Without Repeating Characters.
//Memory Usage: 40.1 MB, less than 13.42% of Java online submissions for Longest Substring Without Repeating Characters.

class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> key = new ArrayList<>();
        int ans = (s.length() == 1)?1:0;
        for(int a = 0;a<s.length();a++){
            char tem = s.charAt(a);      
            if(!key.contains(tem)){
                key.add(tem);
            }else{
                if(key.size()>ans) ans=key.size();
                for(int b = key.indexOf(tem);b>=0;b--){
                    key.remove(b);
                }
                key.add(tem);
            }
        }
        if(key.size()>ans) ans=key.size();
        return ans;
    }
}
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Excel Sheet Column Title.
//Memory Usage: 35.4 MB, less than 50.25% of Java online submissions for Excel Sheet Column Title.

class Solution {
    public String convertToTitle(int n) {
        String res = "";
        while(n != 0) {
            char ch = (char)((n - 1) % 26 + 65);
            n = (n - 1) / 26;
            res = ch + res;
        }
        return res;
    }
}
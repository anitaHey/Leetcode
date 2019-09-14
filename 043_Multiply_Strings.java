/**
 * Runtime: 4 ms, faster than 86.81% of Java online submissions for Multiply Strings.
 * Memory Usage: 36.6 MB, less than 100.00% of Java online submissions for Multiply Strings.
 */
class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0")||num2.equals("0")) return "0";
        int length = num1.length()+num2.length();
        int[] ans = new int[length];
        
        for(int a = 0;a<num1.length();a++){
            for(int b = 0;b<num2.length();b++){
                ans[length-2-(a+b)] += (num1.charAt(a)-'0') * (num2.charAt(b)-'0');
            }
        }
        
        String ans_string ="";
        for(int a = 0;a<ans.length-1;a++){
            ans[a+1] += (ans[a] / 10);
            ans[a] %= 10;
            ans_string = String.valueOf(ans[a]) + ans_string;
        }
        
        if(ans[ans.length-1]!=0) ans_string = String.valueOf(ans[ans.length-1]) + ans_string;
        
        return ans_string;
    }
}
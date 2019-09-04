/**
 * Runtime: 1 ms, faster than 99.42% of Java online submissions for Count and Say.
 * Memory Usage: 34.2 MB, less than 100.00% of Java online submissions for Count and Say.
 */
class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";

        String input = countAndSay(n-1);
        StringBuilder ans = new StringBuilder();
        char last = '\0';
        int count = 0;
        for(int a = 0; a < input.length(); a++){
            if(a == 0){
                last = input.charAt(a);
                count = 1;
            }else if(input.charAt(a) == last){
                count ++;
            }else{
                ans.append(count).append(last);
                last = input.charAt(a);
                count = 1;
            }
            
            if(a == input.length()-1) ans.append(count).append(last);         
        }

        return ans.toString();
    }
}

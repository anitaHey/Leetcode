/**
 * Runtime: 2 ms, faster than 71.71% of Java online submissions for Add Binary.
 * Memory Usage: 36.1 MB, less than 100.00% of Java online submissions for Add Binary.
 */
class Solution {
    public String addBinary(String a, String b) {
        int plus = 0;
        int a_length = a.length(),b_length = b.length();
        StringBuilder ans = new StringBuilder();
        while(a_length > 0 || b_length > 0){
            int a_num = ((--a_length) < 0)?0:Character.getNumericValue(a.charAt(a_length));
            int b_num = ((--b_length) < 0)?0:Character.getNumericValue(b.charAt(b_length));

            int tem = a_num + b_num + plus;
            if(tem >1){
                plus = 1;
                ans.insert(0,tem-2);
            }else{
                plus = 0;
                ans.insert(0,tem);
            }
        }
        if(plus==1) ans.insert(0,1);
        
        return ans.toString();
    }
}

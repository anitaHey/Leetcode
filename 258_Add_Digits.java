//Runtime: 1 ms, faster than 93.14% of Java online submissions for Add Digits.
//Memory Usage: 32.6 MB, less than 100.00% of Java online submissions for Add Digits.

class Solution {
    public int addDigits(int num) {
        while(num>=10){
            int tem = 0;
            while(num>0){
                tem+=num%10;
                num = num / 10;
            }
            num = tem;
        }
        return num;
    }
}
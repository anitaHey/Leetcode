//Runtime: 1 ms, faster than 87.38% of Java online submissions for Happy Number.
//Memory Usage: 32.2 MB, less than 100.00% of Java online submissions for Happy Number.

class Solution {
    public boolean isHappy(int n) {
        while(n >= 10){
            int add = (int)Math.pow(n % 10,2);
            while(n>=10){
                n /= 10;
                add+=Math.pow(n % 10,2);
            }
            n = add;
        }
        if(n==1||n==7) return true;
        else return false;
    }
}
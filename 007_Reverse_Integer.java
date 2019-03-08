//Runtime: 16 ms, faster than 76.45% of Java online submissions for Reverse Integer.
//Memory Usage: 37.9 MB, less than 48.53% of Java online submissions for Reverse Integer.

class Solution {
    public int reverse(int x) {
        String input = String.valueOf(x);
        String ans="";
        boolean min = false;
        for(int a = input.length()-1;a>=0;a--){
            if(a==0&&input.charAt(a)=='-'){
                min = true;
                break;
            }
            ans=ans+input.charAt(a);
        }
        if(Long.parseLong(ans)>Integer.MAX_VALUE||Long.parseLong(ans)<Integer.MIN_VALUE) return 0;
        else
            if(min) return -(Integer.valueOf(ans));
            else return Integer.valueOf(ans);
    }
}
//Runtime: 7 ms, faster than 100.00% of Java online submissions for Roman to Integer.
//Memory Usage: 39.1 MB, less than 18.99% of Java online submissions for Roman to Integer.

class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        int[] nums = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] chars= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        for(int a = 0;a<s.length();a++){
            int check = -1;
            char tem = s.charAt(a);
            if(a+1 < s.length())
                check = Arrays.asList(chars).indexOf(String.valueOf(tem)+String.valueOf(s.charAt(a+1)));
            if(check==-1){
                check = Arrays.asList(chars).indexOf(String.valueOf(tem));
                ans+=nums[check];
            }else{
                ans+=nums[check];
                a++;
            }   
        }
        return ans;
    }
}
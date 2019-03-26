//Runtime: 4 ms, faster than 100.00% of Java online submissions for Integer to Roman.
//Memory Usage: 37.2 MB, less than 100.00% of Java online submissions for Integer to Roman.

class Solution {
    public String intToRoman(int num) {
        String result = "";
        int[] nums = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] chars= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        while(num!=0){
            for(int i =0; i<nums.length;i++){
                if(num>=nums[i]){
                    result = result+chars[i];
                    num-=nums[i];
                    break;
                }
            }
        }
        return result;
    }
}
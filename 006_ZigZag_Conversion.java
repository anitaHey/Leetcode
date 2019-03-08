//Runtime: 18 ms, faster than 98.12% of Java online submissions for ZigZag Conversion.
//Memory Usage: 39.3 MB, less than 86.26% of Java online submissions for ZigZag Conversion.

class Solution {
    public String convert(String s, int numRows) {
        int count = 4+2*(numRows-3);
        char[] ans = new char[s.length()];
        int index = 0;
        if(numRows<s.length() && numRows!=1 ){
            for(int a = 0;a<numRows;a++){
                int con = 0;
                int tem = count - 2*a;
                int plus = a;
                ans[index++] = s.charAt(plus);
                while(con>=0){
                    con--;
                    if(tem!=0 && (plus=plus+tem)<s.length()){
                        ans[index++] = s.charAt(plus);
                        con++;
                    }
                    if(a*2 !=0 && (plus = plus+a*2)<s.length()){
                        ans[index++] = s.charAt(plus);
                        con++;
                    } 
                }
            }
        }else{
            return s;
        }
        return String.valueOf(ans);
    }
}
//Runtime: 20 ms, faster than 46.63% of Java online submissions for String to Integer (atoi).
//Memory Usage: 38.8 MB, less than 6.65% of Java online submissions for String to Integer (atoi).

class Solution {
    public int myAtoi(String str) {
        str = str.trim();
        String input = str.split(" ")[0];
        long output=0;
        boolean no = true;
        for(int a =0;a<input.length();a++){
            if(a==0 && (input.charAt(a)=='-'||input.charAt(a)=='+')) continue;
            if((int)input.charAt(a)==48){
                if(no && a!=0){
                    input = input.substring(0,a)+input.substring(a+1,input.length());
                    a--;
                }else{
                    continue;
                }
            }else if((int)input.charAt(a)<48||(int)input.charAt(a)>57){
                input = input.substring(0,a);
                break;
            }else{
                no = false;
            }
        }
            

        try{
            output = Long.valueOf(input);
        }catch(Exception e){
            try{
                double tem = Double.valueOf(input);
                output = (long)Math.floor(tem);
            }catch(Exception ea){
                output = 0 ;
            }
            
        }
        if(output>0&&output>Integer.MAX_VALUE) return Integer.MAX_VALUE;
        else if(output<0&&output<Integer.MIN_VALUE) return Integer.MIN_VALUE;
        else return (int)output;

    }
}
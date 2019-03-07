//Runtime: 0 ms, faster than 100.00% of Java online submissions for To Lower Case.
//Memory Usage: 36.9 MB, less than 5.33% of Java online submissions for To Lower Case.

class Solution {
    public String toLowerCase(String str) {
        String ans="";
        for(int a = 0;a<str.length();a++){
            if(str.charAt(a)>='A'&&str.charAt(a)<='Z')
                ans = ans+(char)((int)str.charAt(a)+32);
            else
                ans = ans+str.charAt(a);
        }
        return ans;
    }
}

//or can just doing by this

// class Solution {
//     public String toLowerCase(String str) {
//         return str.toLowerCase();
//     }
// }
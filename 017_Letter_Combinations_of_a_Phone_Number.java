//Runtime: 1 ms, faster than 100.00% of Java online submissions for Letter Combinations of a Phone Number.
//Memory Usage: 37.1 MB, less than 84.29% of Java online submissions for Letter Combinations of a Phone Number.

class Solution {
    Map<String, String> phone = new HashMap<String, String>() {{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
    }};
    
    List<String> ans = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(!digits.equals("")){
            com("",digits);
            return ans;
        }else
            return ans;
    }
    
    public void com(String letters,String digits){
        int length = phone.get(String.valueOf(digits.charAt(0))).length();
        for(int a = 0;a<length;a++){
            String re_letters = letters+ phone.get(String.valueOf(digits.charAt(0))).charAt(a);
            if(digits.length()>1){
                String re_digits = digits.substring(1,digits.length());
                com(re_letters,re_digits);
            }else{
                ans.add(re_letters);
            }
        }
    }
}
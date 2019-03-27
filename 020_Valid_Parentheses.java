//Runtime: 1 ms, faster than 99.98% of Java online submissions for Valid Parentheses.
//Memory Usage: 35.7 MB, less than 36.72% of Java online submissions for Valid Parentheses.

class Solution {
    public boolean isValid(String s) {
        boolean ans = true;
        Stack<Character> tem = new Stack<Character>();
        for(int a = 0;a<s.length();a++){
            char word = s.charAt(a);
            switch(word){
                case '(':
                    tem.push('(');
                    break;
                case ')':
                    if(tem.empty()||tem.pop()!='(') ans=false;
                    break;
                case '{':
                    tem.push('{');
                    break;
                case '}':
                    if(tem.empty()||tem.pop()!='{') ans=false;
                    break;
                case '[':
                    tem.push('[');
                    break;
                case ']':
                    if(tem.empty()||tem.pop()!='[') ans=false;
                    break;
            }
            if(!ans)break;
        }
        if(!tem.empty()) ans=false;
        return ans;
    }
}
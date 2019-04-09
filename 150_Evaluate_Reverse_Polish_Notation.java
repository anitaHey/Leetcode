//Runtime: 7 ms, faster than 42.04% of Java online submissions for Evaluate Reverse Polish Notation.
//Memory Usage: 38.9 MB, less than 13.83% of Java online submissions for Evaluate Reverse Polish Notation.

class Solution {
    public int evalRPN(String[] tokens) {
        int ans = 0;
        Stack<Integer> number = new Stack<>();
        for(int a = 0;a<tokens.length;a++){
            String word = tokens[a];
            if(word.equals("*") || word.equals("/") || word.equals("+") || word.equals("-")){
                int num1 = number.pop();
                int num2 = number.pop();
                switch(word){
                    case "+":
                        ans = num1 + num2;
                        break;
                    case "-":
                        ans = num2 - num1;
                        break;
                    case "*":
                        ans = num2 * num1;
                        break;
                    case "/":
                        ans = num2 / num1;
                        break;
                }
                number.push(ans);
            }else{
                int num = Integer.valueOf(word);
                number.push(num);
                ans = num;
            }
        }
        return ans;
    }
}
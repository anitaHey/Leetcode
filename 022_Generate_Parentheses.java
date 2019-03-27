//Runtime: 1 ms, faster than 99.95% of Java online submissions for Generate Parentheses.
//Memory Usage: 37.9 MB, less than 62.02% of Java online submissions for Generate Parentheses.

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList();
        if(n==0) return new ArrayList();
        sol(ans,"",n,0,0);
        return ans;
    }
    
    public void sol(List<String> a,String word,int num,int now,int count){
        if(num==count)
            a.add(word);
        else{
            if(now<num) sol(a,word+"(",num,now+1,count);
            if(now>count) sol(a,word+")",num,now,count+1);
        }
    }
}
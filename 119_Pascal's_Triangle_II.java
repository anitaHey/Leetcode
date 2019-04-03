//Runtime: 1 ms, faster than 84.47% of Java online submissions for Pascal's Triangle II.
//Memory Usage: 32.7 MB, less than 100.00% of Java online submissions for Pascal's Triangle II.

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans = new ArrayList<>(); 
        for(int a =1 ;a <= rowIndex+1;a++){
            List<Integer> row = new ArrayList<>();
            for(int b = 0;b < a ;b++){
                if(b==0||b==a-1){
                    row.add(1);
                }else{
                    int tem = ans.get(a-2).get(b-1)+ans.get(a-2).get(b);
                    row.add(tem);
                }
            }
            ans.add(row);
        }
        return ans.get(ans.size()-1);
    }
}
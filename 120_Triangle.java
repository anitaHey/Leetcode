//Runtime: 7 ms, faster than 20.29% of Java online submissions for Triangle.
//Memory Usage: 38.8 MB, less than 10.48% of Java online submissions for Triangle.

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int ans = Integer.MAX_VALUE;
        List<List<Integer>> min = new ArrayList<>();
        for(int a = 0;a < triangle.size();a++){
            List<Integer> row =  new ArrayList<>();
            int tem = 0;
            for(int b = 0;b < triangle.get(a).size();b++){
                if(a==0) tem =triangle.get(a).get(b);
                else{
                    if(b==0) tem = triangle.get(a).get(b)+min.get(a-1).get(b);
                    else if(b==triangle.get(a).size()-1) tem = triangle.get(a).get(b)+min.get(a-1).get(b-1);
                    else tem = triangle.get(a).get(b)+Math.min(min.get(a-1).get(b),min.get(a-1).get(b-1));
                }
                if(a == triangle.size()-1) ans = Math.min(ans,tem);
                else row.add(tem);
            }
            min.add(row);
        }
        return ans;
    }
}
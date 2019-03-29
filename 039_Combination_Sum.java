//Runtime: 5 ms, faster than 97.75% of Java online submissions for Combination Sum.
//Memory Usage: 38.6 MB, less than 71.35% of Java online submissions for Combination Sum.

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> tem = new ArrayList<>();
        search(candidates,target,ans,0,tem);
        return ans;
    }
    public void search(int[] candidates, int target,List<List<Integer>> ans,int start,List<Integer> tem){
        if(target>0){
            for(int a =start;a<candidates.length;a++){
                tem.add(candidates[a]);
                search(candidates,target-candidates[a],ans,a,tem);
                tem.remove(tem.size() - 1);
            }   
        }else if(target==0){
             ans.add(new ArrayList<>(tem));
        }
    }
}

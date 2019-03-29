//Runtime: 38 ms, faster than 10.89% of Java online submissions for Combination Sum II.
//Memory Usage: 42.8 MB, less than 13.87% of Java online submissions for Combination Sum II.

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        search(ans,new ArrayList<>(),0,candidates,target);
        return ans;
    }
    public void search(List<List<Integer>> ans,List<Integer> tem,int start,int[] candidates, int target){
        if(target>0){
            for(int a = start;a<candidates.length;a++){
                tem.add(candidates[a]);
                search(ans,tem,a+1,candidates,target-candidates[a]);
                tem.remove(tem.size()-1);
            }
        }else if(target==0){
            if(!ans.contains(tem))
                ans.add(new ArrayList<>(tem));
        }
    }
}
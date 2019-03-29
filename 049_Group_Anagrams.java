//Runtime: 17 ms, faster than 40.31% of Java online submissions for Group Anagrams.
//Memory Usage: 43.4 MB, less than 50.56% of Java online submissions for Group Anagrams.

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> count = new HashMap<>();
        for(int a = 0;a<strs.length;a++){
            char[] tem = strs[a].toCharArray();
            Arrays.sort(tem);
            
            if(count.containsKey(Arrays.toString(tem)))
                count.get(Arrays.toString(tem)).add(strs[a]);
            else
                count.put(Arrays.toString(tem),new ArrayList<>(Arrays.asList(strs[a])));
        }
        List<List<String>> ans = new ArrayList<>();
        ans.addAll(count.values());
        return ans;
    }
}
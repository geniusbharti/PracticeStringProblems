class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap();
        // map.put("", new ArrayList<>());
        for(int i=0; i<strs.length; i++){
            // if(strs[i].isEmpty()) {map.get("").add(""); continue;}
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String word = new String(charArray);
            map.putIfAbsent(word, new ArrayList<String>());
            map.get(word).add(strs[i]);
        }
        List<List<String>> ans = new ArrayList();
        for(List<String> list: map.values()){
            // if(list.size()!=0) ans.add(list);
            ans.add(list);
        }
        return ans;
    }
}

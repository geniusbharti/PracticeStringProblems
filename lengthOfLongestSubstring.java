class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap();
        int i=0, max=Integer.MIN_VALUE;
        for(int j=0; j<n; j++){
            if(map.containsKey(s.charAt(j))){
                i=Math.max(i, map.get(s.charAt(j))+1); 
            }
            map.put(s.charAt(j), j);
            max=Math.max(max, j-i+1);
        }
        return max!=Integer.MIN_VALUE ? max : 0;
    }
}

class Solution {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        String newstr = s;

        for(int i=0;i<indices.length; i++){
            int idx = indices[i];
            String src = sources[i];
            String tar = targets[i];
            if(s.substring(idx, idx+src.length()).equals(src)){
                newstr = newstr.substring(0, idx)+tar+newstr.substring(idx+src.length());
            }
        }

        return newstr;
    }
}

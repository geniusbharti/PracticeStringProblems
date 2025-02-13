class Solution {
    public int repeatedStringMatch(String a, String b) {
        if(b.isEmpty()) return 0;
        if(b.length()<=a.length()){
            if(a.contains(b)) return 1;
            // else return -1;
        }
        int i=1;
        String newstr=a;
        for(; b.length()>newstr.length(); i++){
            newstr = newstr+a;
        }
        

        if(newstr.contains(b)) return i;

        newstr+=a;
        if(newstr.contains(b)) return i+1;
        return -1;
    }
}

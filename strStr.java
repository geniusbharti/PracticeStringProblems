class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()>haystack.length()) return -1;

        int d = 26;
        int p = 5381;
        int h = 1; //used when we remove things

        //calculate pre hashes
        int txtHash = 0;
        int patHash = 0;


        //precompute : used when we remove things
        for(int i = 0; i<needle.length()-1; i++){
            h = (h*d) % p;
        }

        for(int i=0;i<needle.length(); i++){
            patHash = ((patHash*d) + (needle.charAt(i)-'a'+1)) %p;
            txtHash = ((txtHash*d) + (haystack.charAt(i)-'a'+1)) %p;
        }

        //now run and check if pattern matches
        //note : when we are at i we check if both patterns equal & then we go down delete curr and add next[i+patLEN]

        for(int i=0; i<=haystack.length()-needle.length(); i++){
            if(patHash==txtHash){
                if(haystack.substring(i, i+needle.length()).equals(needle)) return i;
            }

            //only when not at last pattern equal length
            if(i<haystack.length()-needle.length()){
                txtHash = (txtHash - ((haystack.charAt(i)-'a'+1)*h)%p)%p;
                txtHash = (txtHash * d + (haystack.charAt(i+needle.length())-'a'+1)) %p;

                if(txtHash<0){
                    txtHash+=p;
                }
            }
        }

        return -1;

    }
}

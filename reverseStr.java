class Solution {//2 4 2
    public String reverseStr(String s, int k) {
        int n = s.length();
        StringBuilder sb = new StringBuilder(s);
        for(int i=0; i<n; ){
            if(i+2*k<n){
                reverse(i, i+k-1, sb);
                i=i+2*k;
            }else if(i+k<n){
                reverse(i, i+k-1, sb);
                // i=i+k;
                break;
            }else if(i+k>=n){
                reverse(i, n-1, sb);
                break;
            }
        }

        return sb.toString();
    }

    void reverse(int i, int j, StringBuilder s){
        while(i<j){
            char ch = s.charAt(i);
            s.setCharAt(i, s.charAt(j));
            s.setCharAt(j, ch);
            i++;
            j--;
        }
    }
}

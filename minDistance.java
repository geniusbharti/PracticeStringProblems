class Solution {
    public int minDistance(String word1, String word2) {
        // sea
        // eat

        //l1-lcs+l2-lcs=l1+l2-2lcs

        int l1 = word1.length();
        int l2 = word2.length();

        //get lcs

        int[][] dp = new int[l1+1][l2+1];

        for(int i=1; i<=l1; i++){
            for(int j=1; j<=l2; j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)) dp[i][j]=1+dp[i-1][j-1];
                else dp[i][j]=Math.max(dp[i][j-1], dp[i-1][j]);
            }
        }

        int lcs = dp[l1][l2];

        return l1+l2-2*lcs;
    }
}

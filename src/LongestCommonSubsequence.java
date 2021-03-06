public class LongestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2) {
        char [] t1=  text1.toCharArray();
        char [] t2 = text2.toCharArray();
        int [][] dp = new int[t1.length + 1][t2.length + 1];
        for (int i = 1; i <= t1.length; i++) {
            for (int j = 1; j <= t2.length; j++) {
                if(t1[i - 1] == t2[j - 1]){
                    dp[i][j] = 1 + dp[i -1][j - 1];
                }else {
                    dp[i][j] = Math.max(dp[i][j - 1],dp[i -1][j]);
                }
            }
        }
        return dp[t1.length][t2.length];
    }
}

package DP;

public class RodCutting {
    public int cutRod(int price[], int n) {
        int[][] dp = new int[n+1][n+1];

        for(int i=0;i<=n;i++){
            dp[0][i] = 0;
            dp[i][0] = 0;
        }

        for(int i=1;i<=n;i++){
            for(int j=0;j<=n;j++){
                if(i<=j){
                    dp[i][j] = Math.max(price[i-1] + dp[i][j-i], dp[i-1][j]);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][n];
    }
}

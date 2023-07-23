package DP;

public class PerfectSumProblem {
    public int perfectSum(int arr[], int n, int sum) {
        int[][] dp = new int[n+1][sum+1];
        int m =  1000000007;
        for(int i=0;i<=sum;i++){
            dp[0][i]=0;
        }
        dp[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            if (arr[i - 1] == 0) {
                dp[i][0] = (dp[i - 1][0] * 2)%m;
            } else {
                dp[i][0] = dp[i - 1][0];
            }
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum;j++){
                if(arr[i-1]<=j){
                    dp[i][j] = (dp[i-1][j-arr[i-1]] + dp[i-1][j])%m;
                }
                else{
                    dp[i][j] = (dp[i-1][j])%m;
                }
            }
        }
        return (dp[n][sum])%m;
    }
}

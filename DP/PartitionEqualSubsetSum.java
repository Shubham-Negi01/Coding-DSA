package DP;

import java.util.Arrays;

public class PartitionEqualSubsetSum {

    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = Arrays.stream(nums).reduce(0, (a,b)->a+b);
        if(sum%2!=0){
            return false;
        }
        return isSubsetSum(n, nums, sum/2);
    }

    static boolean isSubsetSum(int N, int arr[], int sum) {

        boolean[][] dp = new boolean[N + 1][sum + 1];

        // for n==0 save false
        for (int i = 0; i <= sum; i++) {
            dp[0][i] = false;
        }
        // for sum==0 save true
        for (int i = 0; i <= N; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= sum; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j - arr[i - 1]] || dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[N][sum];
    }
}

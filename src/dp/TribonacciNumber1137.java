package dp;

import java.util.Arrays;

public class TribonacciNumber1137 {
    static int trib2(int n,int[] dp){

        if(n == 0 || n == 1){
            return n;
        }
        if(n == 2){
            return 1;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        dp[n] = trib2(n-1,dp) + trib2(n-2,dp) + trib2(n-3,dp);
        return dp[n];
    }
    static int trib1(int n){
        if (n == 0 || n == 1){
            return n;
        }
        if (n == 2){
            return 1;
        }

        int []dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;

        for (int i = 3; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2]+dp[i-3];
        }
        return dp[n];
    }
    static int trib(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 1;

        int prev1 = 0;
        int prev2 = 1;
        int prev3 = 1;

        for (int i = 3; i <= n; i++) {

            int curr = prev1 + prev2 + prev3;

            prev1 = prev2;
            prev2 = prev3;
            prev3 = curr;
        }

        return prev3;
    }
    public static void main(String[] args) {
        int n = 8;
        int ans = trib(n);
        System.out.println("ans = "+ans);

        int ans1 = trib1(n);
        System.out.println("ans1 = "+ans1);

        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        int ans2 = trib2(n,dp);
        System.out.println("ans2 = "+ans2);
    }
}

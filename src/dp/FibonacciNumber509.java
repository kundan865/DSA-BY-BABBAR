package dp;

import java.util.Arrays;

public class FibonacciNumber509 {
    static int fib2(int n,int[] dp){

        if(n <= 1){
            return n;
        }

        if (dp[n] != -1){
            return dp[n];
        }

        dp[n] = fib2(n-1,dp) + fib2(n-2,dp);

        return dp[n];
    }
    static int fib1(int n){
        if(n == 0 || n == 1){
            return n;
        }

        int prev1 = 1;
        int prev2 = 0;

        for (int i = 2; i <= n; i++){

            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
    static int fib(int n){

        if(n == 0 || n == 1){
            return n;
        }

        int []dp = new int[n+1];

        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
    public static void main(String[] args) {

        int n = 8;
        int ans = fib(n);
        System.out.println("ans = "+ans);

        int ans1 = fib1(n);
        System.out.println("ans1 = "+ans1);

        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        int ans2 = fib2(n,dp);
        System.out.println("ans2 = "+ans2);
    }
}

package dp;

public class ClimbStairs70 {
    static int climbStairs(int n){

        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return  2;

        int prev2 = 1;
        int prev1 = 2;
        for(int i = 3; i <= n; i++){

            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
    public static void main(String[] args) {
        int n = 5;
        int ans = climbStairs(n);
        System.out.println("ans = "+ans);
    }
}

package recursion.LeetCode;

public class ClimbingStairs70 {
    static int climbStairs(int n) {
        if(n <= 2){
            return n;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
    public static void main(String[] args) {
        int n = 5;
        int ans = climbStairs(n);
        System.out.println("ans = "+ans);
    }
}

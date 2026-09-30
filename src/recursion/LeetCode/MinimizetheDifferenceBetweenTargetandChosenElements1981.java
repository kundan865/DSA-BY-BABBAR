package recursion.LeetCode;

public class MinimizetheDifferenceBetweenTargetandChosenElements1981 {
    static int solve(int[][] mat,int row,int target, int sum){
        if(row >= mat.length){
            return Math.abs(target - sum);
        }

        int mini = Integer.MAX_VALUE;

        for(int num : mat[row]){
            int ans = solve(mat,row+1,target,sum+num);
            mini = Math.min(ans,mini);
        }

        return mini;
    }
    static int minimizeTheDifference(int[][] mat,int target){
        int sum = 0;
        int row = 0;
        int ans = solve(mat,row,target,sum);
        return ans;
    }
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int target = 50;
        int ans = minimizeTheDifference(mat, target);
        System.out.println("ans  = " + ans);
    }
}

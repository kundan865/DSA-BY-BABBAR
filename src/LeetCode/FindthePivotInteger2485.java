package LeetCode;

public class FindthePivotInteger2485 {

    static int findPivot(int n){
        int total = n * (n + 1) / 2;
        int leftSum = 0;
        for(int x = 1; x <= n; x++){
            leftSum += x;
            int rightSum = total - leftSum + x;
            System.out.println(leftSum+" "+rightSum);
            if(leftSum == rightSum){
                return x;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n = 8;
        int ans = findPivot(n);
        System.out.println("ans = "+ans);
    }
}

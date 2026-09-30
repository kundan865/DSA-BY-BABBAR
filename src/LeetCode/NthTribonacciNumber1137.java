package LeetCode;

public class NthTribonacciNumber1137 {
    public static int tribonacci(int n) {

        int a = 0;
        int b = 0;
        int c = 1;

        for(int i = 0; i < n; i++){
            int d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
        return a;
    }
    public static void main(String[] args) {
        int n = 4;
        int ans = tribonacci(n);
    }
}

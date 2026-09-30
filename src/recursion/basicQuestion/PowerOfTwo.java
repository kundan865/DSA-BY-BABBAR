package recursion.basicQuestion;

public class PowerOfTwo {
    static int powerOfTwo(int n){
        if(n == 0){
            return 1;
        }
        return 2 * powerOfTwo(n - 1);
    }
    public static void main(String[] args) {
        int n = 30;
        int ans = powerOfTwo(n);
        System.out.println("ans = "+ans);
    }
}

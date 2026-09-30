package recursion.basicQuestion;

public class FindFactorial {
    static int find(int n){
        if(n == 0)
            return 1;
        return n * find(n - 1);
    }
    public static void main(String[] args) {
        int n = 5;
        int ans = find(n);
        System.out.println("ans = "+ans);
    }
}

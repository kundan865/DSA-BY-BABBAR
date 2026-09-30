package LeetCode;


public class Sqrt69 {
    public static int mySqrt(int x) {
        if (x < 2) {
            return x;
        }

        long left = 1;
        long right = x / 2;
        System.out.println("left = "+left+" right = "+right);

        while (left <= right) {

            long mid = left + (right - left) / 2;

            if (mid * mid == x) {
                return (int) mid;
            }

            if (mid * mid < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            System.out.println("left = "+left+" right = "+right);

        }

        return (int) right;
    }

    public static void main(String[] args) {

        int x = 56;
        int ans = mySqrt(x);
        System.out.println("ans = "+ans);
    }
}

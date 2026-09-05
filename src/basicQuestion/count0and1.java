package basicQuestion;

public class count0and1 {
    static int[] count0and1(int[]arr) {
        int zero = 0;
        int one = 0;

        for (int ele : arr) {
            if (ele == 0) zero++;

            if (ele == 1) one++;
        }

        return new int[]{zero, one};
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0};

        int ans[] = count0and1(arr);
        System.out.println("number of zero = " + ans[0]);
        System.out.println("number of one = " + ans[1]);
    }
}

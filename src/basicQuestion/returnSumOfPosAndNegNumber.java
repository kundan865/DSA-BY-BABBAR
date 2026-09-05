package basicQuestion;

public class returnSumOfPosAndNegNumber {
    static int[] sumOfPosAnsNeg(int []arr){
        int posSum = 0;
        int negSum = 0;
        for(int ele : arr){
            if(ele < 0){
                negSum += ele;
            }
            else {
                posSum += ele;
            }
        }
        return new int[] {posSum,negSum};
    }
    public static void main(String[] args) {
        int[] arr = {-1, -4, -9, -8, -7, -65, -12, 6, 4, 6, 2, 3, 4, 3, 4, 6};
        int [] ans = sumOfPosAnsNeg(arr);
        System.out.println("sum of positive "+ans[0]);
        System.out.println("sum of negative "+ans[1]);
    }
}

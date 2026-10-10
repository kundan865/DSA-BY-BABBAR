package basicQuestion;

public class findTheSecondLargestNumber {
    static int secondLargestNumber(int[] arr){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int ele : arr){
            if (first < ele){

                second = first;
                first = ele;

            } else if(ele > second && ele != first){
                second = ele;
            }
        }
        return second;
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 15, 19, 21};
        int ans = secondLargestNumber(arr);
        System.out.println("ans = "+ans);
    }
}

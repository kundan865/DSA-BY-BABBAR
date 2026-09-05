package basicQuestion;

public class findMaximumInAnArray {

    static int search(int[] arr){
        int ans = Integer.MIN_VALUE;
        for(int ele : arr){
            if(ans<ele){
                ans = ele;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 5, 2, 3, 5, 6, 4, 5, 500};
        int ans = search(arr);
        System.out.println("ans = "+ans);
    }
}

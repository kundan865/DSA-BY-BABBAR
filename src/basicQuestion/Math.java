package basicQuestion;

public class Math {
    static void swap(int []nums,int st, int end){
        int temp  = nums[st];
        nums[st] = nums[end];
        nums[end] = temp;
    }
}

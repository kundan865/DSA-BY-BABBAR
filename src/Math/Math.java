package Math;

public class Math {
    public static void swap(int []nums,int st, int end){
        int temp  = nums[st];
        nums[st] = nums[end];
        nums[end] = temp;
    }
    public static int Mid(int left , int right){
        return left + (right - left) / 2;
    }
}

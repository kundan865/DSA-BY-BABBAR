package LeetCode;

public class PeakIndexinaMountainArray852 {
    static int findPeak(int []nums){
        int left  = 0;
        int right = nums.length - 1;
        int ans = -1;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] < nums[mid+1]){
                left = mid+1;
            }else{
                right = mid;
                ans = mid;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
//        int nums[] = {0,1,2,0};
        int nums[] = {0,3,5,12,2};
        int ans = findPeak(nums);
        System.out.println("ans = "+ans);
    }
}

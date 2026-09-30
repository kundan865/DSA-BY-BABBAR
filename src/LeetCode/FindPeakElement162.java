package LeetCode;

public class FindPeakElement162 {

    static int find(int []nums){
        if(nums.length <= 1){
            return 0;
        }
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;

        while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] < nums[mid + 1]){
                left = mid + 1;
            } else {
                right = mid ;
                ans = mid;
            }
        }
        return ans < 0 ? nums.length - 1 : ans;
    }
    public static void main(String[] args) {
        int []nums = {1,2,1,3,5,6,4};
        int ans = find(nums);
        System.out.println("ans = "+ans);

    }
}

package CodeHelp;

import static Math.Math.Mid;

public class FindPivotIndexRotatedSortedArray449 {

    static int findPivot(int []nums){
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int ans = -1;

        while(left <= right){

            int mid = Mid(left,right);
            if(nums[mid] > nums[n - 1]){
                left = mid + 1;
                ans = mid;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int []nums = {2,3,4,5,1};
        int ans = findPivot(nums);
        System.out.println("ans = "+ans);
    }
}

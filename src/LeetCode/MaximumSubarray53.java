package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class MaximumSubarray53 {
    public static int maxSubArray(int[] nums) {

        int currSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            currSum += nums[i];

            maxSum = Math.max(maxSum, currSum);

            if(currSum < 0){
                currSum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int []nums = {-2,1,-3,4,-1,2,1,-5,4};
        int ans = maxSubArray(nums);
        System.out.println(ans);
    }
}

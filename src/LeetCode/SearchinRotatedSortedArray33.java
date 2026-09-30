package LeetCode;

import static Math.Math.Mid;

public class SearchinRotatedSortedArray33 {
    static int findPivot(int []nums){

        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int ans = -1;

        while (left <= right){

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
    static int binarySearch(int []nums,int target,int left,int right){

        while(left <= right){
            int mid = Mid(left , right);
            if(nums[mid] == target){
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    static int search(int []nums,int target){
        int n = nums.length;
        int pivot = findPivot(nums);

        if (nums[0] <= target && target <= nums[pivot]) {
            return binarySearch(nums, target, 0, pivot);
        }

        if (pivot + 1 < n && nums[pivot + 1] <= target && target <= nums[n - 1]) {
            return binarySearch(nums, target, pivot + 1, n - 1);
        }
        return -1;
    }
    public static void main(String[] args) {
        int  []nums = {4,5,6,7,0,1,2};
        int target = 2;

        int ans = search(nums,target);
        System.out.println("ans "+ans);
    }
}

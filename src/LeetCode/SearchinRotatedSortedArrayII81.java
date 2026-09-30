package LeetCode;

public class SearchinRotatedSortedArrayII81 {
    static int findPivot(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;
            if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
                left++;
                right--;
            }

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            }
            else if (nums[mid] < nums[right]) {
                right = mid;
            }
            else {
                // duplicates
                right--;
            }
        }

        return left;
    }
    static boolean binarySearch(int[] nums, int left, int right, int target) {

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return true;
            }

            if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return false;
    }
    public static boolean search(int[] nums, int target) {

        int pivot = findPivot(nums);
        System.out.println("pivot = "+pivot);

        // Array normally sorted
        if (pivot == 0) {
            return binarySearch(nums, 0, nums.length - 1, target);
        }

        // Target is in left sorted part
        if (target >= nums[0]) {
            return binarySearch(nums, 0, pivot - 1, target);
        }

        // Target is in right sorted part
        return binarySearch(nums, pivot, nums.length - 1, target);
    }

    public static void main(String[] args) {
        int []nums = {2,5,6,0,0,1,2};
        int target = 0;
        boolean ans = search(nums,target);
        for(int ele : nums){
            System.out.print(ele+" ");
        }
        System.out.println("ans = "+ans);
    }
}

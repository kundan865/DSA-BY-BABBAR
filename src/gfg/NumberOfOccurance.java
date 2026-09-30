package gfg;

public class NumberOfOccurance {
    static int findLowerBound(int[] nums, int target) {

        int left = 0;
        int right = nums.length;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    static int findUpperBound(int[] nums, int target) {

        int left = 0;
        int right = nums.length;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
    static int count(int []nums,int target){
        int lowerBound = findLowerBound(nums,target);
        int upperBound = findUpperBound(nums,target);
        return upperBound - lowerBound;
    }
    public static void main(String[] args) {
        int []nums = {1,1,2,2,2,2,3};
        int target = 3;
        int ans = count(nums,target);
        System.out.println("ans = "+ans);
    }
}

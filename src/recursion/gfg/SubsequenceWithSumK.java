package recursion.gfg;

public class SubsequenceWithSumK {
    static boolean solve(int[]nums,int index,int sum,int target) {

        if (sum == target) {
            return true;
        }
        if (index >= nums.length) {
            return false;
        }

        boolean includeAns = solve(nums, index + 1, sum + nums[index], target);
        if (includeAns) {
            return true;
        }
        boolean excludeAns = solve(nums, index + 1, sum, target);

        return excludeAns;
    }
    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 2, 7, 6, 1, 5};
        int target = 24;
        int ans = 0;
        int index = 0;

        boolean finalAns = solve(nums, index, ans, target);
        System.out.println("ans = " + finalAns);

    }
}

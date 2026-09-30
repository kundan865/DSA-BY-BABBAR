package recursion.LeetCode;

public class JumpGame55 {
    static boolean solve(int[] nums, int index) {

        if(index == nums.length - 1){
            return true;
        }

        if(index >= nums.length){
            return false;
        }

        if(nums[index] == 0){
            return false;
        }

        for(int jump = 1; jump <= nums[index]; jump++){

            boolean recAns = solve(nums, index + jump);

            if(recAns){
                return true;
            }
        }

        return false;
    }
    static boolean canJump(int[] nums){

        int maxReach = 0;

        for (int i = 0; i < nums.length; i++) {

            if (i > maxReach) {
                return false;
            }

            maxReach = Math.max(maxReach, i + nums[i]);

            if (maxReach >= nums.length - 1) {
                return true;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        boolean ans = canJump(nums);
        System.out.println("ans = "+ans);
    }
}

package recursion.LeetCode;

public class PartitionEqualSubsetSum416 {
    static boolean solve(int[]nums,int index,int target){
        if (target == 0){
            return true;
        }

        if (target < 0){
            return false;
        }
        if(index >= nums.length){
            return false;
        }

        boolean includeAns = solve(nums,index + 1,target - nums[index]);
        boolean excludeAns = solve(nums,index + 1,target);
        return includeAns || excludeAns;
    }
    static boolean canPartition(int []nums){
        int totalSum = 0;
        for (int num : nums){
            totalSum += num;
        }

        if((totalSum & 1) == 1){
            return false;
        }

        int target = totalSum / 2;
        int index = 0;
        return solve(nums,index,target);
    }
    public static void main(String[] args) {
        int []nums = {1,5,11,5};
        boolean ans = canPartition(nums);
        System.out.println("ans =  "+ans);
    }
}

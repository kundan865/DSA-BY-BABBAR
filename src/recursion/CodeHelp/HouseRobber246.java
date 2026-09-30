package recursion.CodeHelp;

public class HouseRobber246 {
    static int rob(int[] nums,int index,int ans){

        if(index >= nums.length){
            return 0;
        }

        // Include current house
        int includeAns = nums[index] + rob(nums, index + 2,ans+nums[index]);

        // Exclude current house
        int excludeAns = rob(nums, index + 1,ans);

        // Return maximum
        int finalAns =  Math.max(includeAns, excludeAns);
        return  finalAns;
    }
    static int houseRobber(int[] nums,int index){

        if(index >= nums.length){
            return 0;
        }

        // Include current house
        int includeAns = nums[index] + houseRobber(nums, index + 2);

        // Exclude current house
        int excludeAns = houseRobber(nums, index + 1);

        // Return maximum
        return Math.max(includeAns, excludeAns);
    }
    public static void main(String[] args) {
        int[] nums = {2,7,5,8};
        int index = 0;
        int ans = 0 ;
        int finalAns = houseRobber(nums,index);
        System.out.println("final answer = "+finalAns);

        int finalAns1 = houseRobber(nums,index);
        System.out.println("final answer = "+finalAns1);
    }
}

package recursion.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIV377 {
    static int solve(int[] nums,int target){

        if(target == 0){
            return 1;
        }
        if(target < 0){
            return 0;
        }

        int count = 0;

        for(int num : nums){
            count += solve(nums,target-num);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int target = 4;

        int ans = solve(nums,target);

        System.out.println("final answer = "+ans);
    }
}

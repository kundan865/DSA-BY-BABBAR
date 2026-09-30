package recursion.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII216 {

    static void solve(int[] nums,int index,int k,int target,int count,
                      List<List<Integer>> ans,List<Integer> output){

        if(count > k){
            return;
        }

        if(count == k && target == 0){
            ans.add(new ArrayList<>(output));
            return;
        }

        if(index >= nums.length){
            return ;
        }

        if(target < 0){
            return;
        }


        int currVal = nums[index];
        output.add(currVal);
        solve(nums, index+1, k,target - currVal, count + 1, ans, output);

        output.removeLast();
        solve(nums, index+1, k, target, count, ans, output);

    }
    public static void main(String[] args) {
        int k = 3;
        int n = 9;

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int count = 0;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;
        int target = n;

        solve(nums, index, k, target, count, ans, output);

        for (List list : ans) {
            System.out.println(list);
        }

    }
}

package recursion.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class SubsetsII90 {
    static void solve(int[] nums,int index,List<List<Integer>> ans,List<Integer> output) {
        if (index >= nums.length) {
            ans.add(new ArrayList<>(output));
            return;
        }

        int currVal = nums[index];
        output.add(currVal);
        solve(nums, index + 1, ans, output);

        while (index + 1 < nums.length && nums[index + 1] == currVal) {
            index++;
        }

        output.removeLast();
        solve(nums, index + 1, ans, output);
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        int index = 0;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();

        solve(nums,index,ans,output);

        for (List list : ans){
            System.out.println(list);
        }

    }
}

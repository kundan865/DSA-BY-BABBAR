package recursion.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII40 {
    static void solve(int[] candidates,int target,int index,
                      List<List<Integer>> ans,List<Integer> output) {
        if(target == 0){
            ans.add(new ArrayList<>(output));
            return;
        }
        if(index >= candidates.length){
            return;
        }

        if(target < 0){
            return;
        }

        int currVal = candidates[index];
        output.add(currVal);
        solve(candidates, target - candidates[index], index+1, ans, output);

        while(index + 1 < candidates.length && candidates[index + 1] == currVal) {
            index++;
        }

        output.removeLast();
        solve(candidates, target , index+1, ans, output);
    }
    public static void main(String[] args) {
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;

        Arrays.sort(candidates);

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;

        System.out.println("before calling");
        solve(candidates, target, index, ans, output);

        System.out.println("afer calling");

        for (List list : ans) {
            System.out.println(list);
        }
    }
}

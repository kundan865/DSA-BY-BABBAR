package recursion.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum39 {
    static void solve(int[] candidates,int index,int target,
                      List<List<Integer>> ans,List<Integer> output) {

        if (target == 0){
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
        solve(candidates, index, target - candidates[index], ans, output);

        output.removeLast();
        solve(candidates, index+1, target, ans, output);
    }
    public static void main(String[] args) {
//        int[] candidates = {2,3,6,7};
//        int target = 7;

        int[] candidates = {2,3,5};
        int target = 8;

        int index = 0;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output =  new ArrayList<>();

        solve(candidates,index,target,ans,output);

        for (List list : ans){
            System.out.println(list);
        }
    }
}

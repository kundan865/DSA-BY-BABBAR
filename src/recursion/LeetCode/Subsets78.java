package recursion.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Subsets78 {
    static void solve(int[]nums,List<List<Integer>> ans, List<Integer> output,int index){
        if(index >=nums.length){
            ans.add(new ArrayList<>(output));
            return;
        }

        int currVal = nums[index];
        output.add(currVal);
        solve(nums,ans,output,index+1);

        output.removeLast();
        solve(nums,ans,output,index+1);
    }
    public static void main(String[] args) {
        int[]nums ={1,2,3};

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;

        solve(nums,ans,output,index);

        for (List list : ans){
            System.out.println(list);
        }

    }
}

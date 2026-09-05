package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class FindMissingElements3731 {
    static List<Integer> find(int []nums){
        List<Integer> ans = new ArrayList<>();
        int max = nums[0];
        int min =  nums[0];

        for(int ele : nums){
            max = Math.max(ele,max);
            min = Math.min(ele,min);
        }
        boolean []present = new boolean[max-min +1];
        for(int num : nums){
            present[num- min] = true;
        }
        for(boolean ele : present){
            System.out.print(ele+" ");
        }

        for (int i = 0; i < present.length; i++) {
            if (!present[i]) {
                ans.add(i + min);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums ={1,4,2,5};
        List<Integer> ans = find(nums);
        System.out.println(ans);
    }
}

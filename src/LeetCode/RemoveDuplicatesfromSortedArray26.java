package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesfromSortedArray26 {
    public static int removeDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        int ans = 1;
        list.add(nums[0]);

        for(int i=1;i<n;i++){
            if(nums[i] == nums[i-1]){
                continue;
            }else {
                ans++;
                list.add(nums[i]);
            }
        }
        for(int i=0;i<list.size();i++){
            nums[i] = list.get(i);
        }
        return ans;
    }

    public static int removeDuplicates1(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 1;

        while(j < n){
            if(nums[i] == nums[j]){
                j++;
            }else{
                i++;
                nums[i] = nums[j];
                j++;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int nums [] = {0,0,1,1,1,2,2,3,3,4};

//        int ans = removeDuplicates(nums);
//        for(int ele : nums){
//            System.out.print(ele+" ");
//        }
//        System.out.println("ans = "+ans);

        int ans1 = removeDuplicates1(nums);
        for(int ele : nums){
            System.out.print(ele+" ");
        }
        System.out.println("ans1 = "+ans1);
    }
}

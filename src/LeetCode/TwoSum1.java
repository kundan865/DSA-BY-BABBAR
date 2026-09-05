package LeetCode;

import java.util.HashMap;

public class TwoSum1 {
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0;i<nums.length-1;i++){
            int finalTarget = target - nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==finalTarget){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
    public static int[] twoSum1(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int required = target - nums[i];

            if (map.containsKey(required)) {
                return new int[] { map.get(required), i };
            }

            map.put(nums[i], i);
        }

        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        int target = 9;

        int [] ans = twoSum1(nums,target);

        System.out.println(ans[0]+" , "+ ans[1]);
    }
}
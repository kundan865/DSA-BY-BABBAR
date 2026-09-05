package LeetCode;

import java.util.*;

public class ThreeSum15 {
    public static List<List<Integer>> threeSum1(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        int n = nums.length;

        for(int i= 0; i < n-2; i++){

            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int left = i + 1;
            int right = n - 1;

            while(left < right){

                int sum = nums[i] + nums[left] + nums[right];
                
                if(sum == 0){

                    ans.add(List.of(nums[i], nums[left], nums[right]));

                   while(left < right && nums[left] == nums[left +1]){
                       left++;
                   }

                   while(left < right && nums[right] == nums[right-1]){
                       right--;
                   }

                   left ++;
                   right --;
                } else if (sum < 0) {
                    left++;
                } else {
                    right --;
                }
            }
        }
        return ans;
    }
    public static List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> set = new HashSet<>();

        int n = nums.length;

        for(int i = 0; i < n-2; i++){

            for(int j = i + 1; j < n-1; j++){

                for(int k = j+1; k < n ;k++){

                    if(nums[i]+nums[j]+nums[k] == 0){

                        List<Integer> list = Arrays.asList(
                                nums[i],
                                nums[j],
                                nums[k]
                        );

                        Collections.sort(list);
                        set.add(list);
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
    public static void main(String[] args) {
        int [] nums = {-1,0,1,2,-1,-4};

        List<List<Integer>> ans = threeSum1(nums);

        for(List list : ans){
            System.out.println(list);
        }
    }
}

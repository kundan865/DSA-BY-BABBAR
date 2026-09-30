package LeetCode;

import java.util.*;

public class SortArraybyIncreasingFrequency1636 {

    public static int[] frequencySort(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Integer[] arr = new Integer[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }

        Arrays.sort(arr, (a, b) -> {

            if (map.get(a) != map.get(b)) {
                return map.get(a) - map.get(b);
            }

            return b - a;
        });

        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3};
        int[] ans = frequencySort(nums);
        for(int ele : ans){
            System.out.print(ele+" ");
        }
    }
}

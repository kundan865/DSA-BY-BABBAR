package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class IntersectionofTwoArraysII350 {
    public static int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] ans = new int[Math.min(nums1.length, nums2.length)];
        int index = 0;

        for (int num : nums2) {
            if (map.getOrDefault(num, 0) > 0) {
                ans[index++] = num;
                map.put(num, map.get(num) - 1);
            }
        }

        return Arrays.copyOf(ans, index);

    }
    public static void main(String[] args) {
//        int[] nums1 = {1, 2, 2, 1};
//        int[] nums2 = {2, 2};
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};

        int[] ans = intersect(nums1, nums2);
        for (int ele : ans){
            System.out.print(ele+" ");
        }
    }
}

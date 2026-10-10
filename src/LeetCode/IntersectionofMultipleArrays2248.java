package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class IntersectionofMultipleArrays2248 {
    public static List<Integer> intersection(int[][] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int[] arr : nums) {
            for (int num : arr) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        List<Integer> ans = new ArrayList<>();

        for (int key : map.keySet()) {
            if (map.get(key) == nums.length) {
                ans.add(key);
            }
        }

        Collections.sort(ans);

        return ans;
    }

    public static void main(String[] args) {
        int[][] nums = {
                {3,1,2,4,5},
                {1,2,3,4},
                {3,4,5,6}
        };

        List<Integer> ans = intersection(nums);

        System.out.println(ans);
    }
}

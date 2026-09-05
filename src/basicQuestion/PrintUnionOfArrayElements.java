package basicQuestion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrintUnionOfArrayElements {
    static List<Integer> union(int []nums1,int []nums2){
        Map<Integer,Integer> map = new HashMap<>();

        for(int ele : nums1){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        for(int ele : nums2){
            if(!map.containsKey(ele)){
                map.put(ele,map.getOrDefault(ele,0)+1);
            }
        }
        return new ArrayList<>(map.keySet());
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2,2,2,2, 3, 4, 5};
        int[] nums2 = {2, 5, 6, 7};

        List<Integer> ans = union(nums1,nums2);
        for(int ele : ans){
            System.out.print(ele+" ");
        }
    }
}

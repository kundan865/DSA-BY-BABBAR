package basicQuestion;

import java.util.*;

public class printArrayIntersectionElement {

    public static int[] intersection2(int[] nums1, int[] nums2){
        Set<Integer> set = new HashSet<>();

        for(int ele : nums1){
            set.add(ele);
        }

        List<Integer> list = new ArrayList<>();
        for(int ele : nums2){
            if(set.contains(ele)){
                list.add(ele);
            }
        }

        int[] result = new int[list.size()];

        for(int i = 0; i<list.size();i++){
            result[i] = list.get(i);
        }
        return result;
    }

    public static int[] intersection(int[] nums1, int[] nums2) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int ele : nums1){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }

        List<Integer> list = new ArrayList<>();

        for(int ele : nums2){
            if(map.containsKey(ele) && map.get(ele) > 0){
                list.add(ele);
                map.put(ele,map.get(ele)-1);
            }
        }

        int [] result = new int[list.size()];
        int index = 0;

        for(int ele : list){
            result[index++] = ele;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4};
        int[] brr = {2, 2, 4, 5};

        int [] ans = intersection(arr,brr);

        for(int ele : ans){
            System.out.print(ele+" ");
        }

        int [] ans2 = intersection2(arr,brr);

        System.out.println();
        for(int ele : ans2){
            System.out.print(ele+" ");
        }
    }
}

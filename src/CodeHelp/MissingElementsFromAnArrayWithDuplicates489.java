package CodeHelp;

import java.awt.image.ImageProducer;
import java.util.*;

public class MissingElementsFromAnArrayWithDuplicates489 {
    static List<Integer> misingElements(int []nums){
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int ele : nums) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

       for(int ele : map.keySet()){
           if(map.get(ele)>1){
               list.add(ele);
           }
       }

        return list;
    }
    public static void main(String[] args) {
        int []nums = {1,2,3,3,4,5,6,6,7,8,9,9,10};
        List<Integer> ans = misingElements(nums);
        System.out.println(ans);
    }
}

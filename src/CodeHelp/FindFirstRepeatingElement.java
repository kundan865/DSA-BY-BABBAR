package CodeHelp;

import java.util.HashMap;
import java.util.Map;

public class FindFirstRepeatingElement {
    static int find(int[] nums){
        Map<Integer,Integer>  map = new HashMap();
        int n = nums.length;

        for(int num : nums){

            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num : nums){
            if(map.get(num)>1){
                return num;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
//        int [] nums ={10,5,3,4,3,5,6};
        int [] nums = {6,10,5,4,9,120,4,6,10};
        int ans = find(nums);
        System.out.println("ans "+ans);
    }
}

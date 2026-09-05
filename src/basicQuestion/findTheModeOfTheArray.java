package basicQuestion;

import java.util.HashMap;
import java.util.Map;

public class findTheModeOfTheArray {
    static int findMode(int []arr){
        Map<Integer,Integer> map = new HashMap<>();

        for(int ele : arr){
            map.put(ele,map.getOrDefault(ele,0) + 1);
        }

        int maxFreq = -1;
        int maxFreqVal = -1;

        for(int key : map.keySet()){

            int currMAxFreq = map.get(key);

            if(maxFreq < currMAxFreq){
                maxFreqVal = key;
            }
        }

        return maxFreqVal;
    }
    public static void main(String[] args) {
        int []arr = {1,1,2,2,2,3,3,3,3,4,4,4,4,4,4,4};
        int ans = findMode(arr);
        System.out.println("ans = "+ans);
    }
}

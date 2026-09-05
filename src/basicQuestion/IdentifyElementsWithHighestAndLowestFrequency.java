package basicQuestion;

import java.util.HashMap;
import java.util.Map;

public class IdentifyElementsWithHighestAndLowestFrequency {
    static int[] findHighestAndLOwestFrequecy(int []arr){
        Map<Integer,Integer> map = new HashMap<>();

        for(int ele : arr)
            map.put(ele , map.getOrDefault(ele,1)+1);

        int lowestFreq = Integer.MAX_VALUE;
        int highestFreq = Integer.MIN_VALUE;

        for(int key : map.keySet()){
            int currFreq = map.get(key);
            if(highestFreq < currFreq){
                highestFreq = key;
            }
            if(lowestFreq > currFreq){
                lowestFreq = key;
            }
        }
        return new int[] {lowestFreq,highestFreq};
    }
    public static void main(String[] args) {
        int []arr = {1,1,2,2,2,3,3,3,3,4,4,4,4,4,4,4};
        int []ans = findHighestAndLOwestFrequecy(arr);
        System.out.println("Highest frequency = "+ans[0]);
        System.out.println("Lowest frequency = "+ans[1]);
    }
}

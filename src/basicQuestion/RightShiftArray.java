package basicQuestion;

import java.util.ArrayList;
import java.util.List;

public class RightShiftArray {
    static void rightShift(int [] arr,int k){
        List<Integer> list = new ArrayList<>();
        int position = k % arr.length;
        int n = arr.length;
        for(int i= n-position;i<arr.length;i++){
            list.add(arr[i]);
        }
        for(int i=0;i<n-position;i++){
            list.add(arr[i]);
        }

        int index = 0;
        for(int ele : list){
          arr[index++] = ele;
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8};
        int k = 3;

        rightShift(arr,k);

        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}

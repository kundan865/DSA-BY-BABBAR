package basicQuestion;

import static basicQuestion.Math.swap;

public class sortAnArray0sAnd1s {

    static void sort0and1(int []arr){
        int st = 0;
        int end = arr.length - 1;

        while( st < end){
            if(arr[st]==0){
                st++;
            } else if (arr[end] == 1) {
                end--;
            }
            else{
                swap(arr,st,end);
            }
        }
    }
    public static void main(String[] args) {
        int []arr = {0,1,0,1,0,1,0,1,0};
        sort0and1(arr);
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}

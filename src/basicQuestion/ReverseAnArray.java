package basicQuestion;

public class ReverseAnArray {
    static void swap(int[] arr ,int st,int end){
        int temp = arr[st];
        arr[st] = arr[end];
        arr[end] = temp;
    }
    public static void reverse(int[]arr){
        int st = 0;
        int end = arr.length - 1;

        while( st < end){
            swap(arr,st++,end--);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};

        reverse(arr);

        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}

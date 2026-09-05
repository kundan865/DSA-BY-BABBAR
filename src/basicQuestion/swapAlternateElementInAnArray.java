package basicQuestion;

public class swapAlternateElementInAnArray {

    static void swap(int arr[],int st,int end){
        int temp = arr[st];
        arr[st] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        if((arr.length & 1)==1){
            System.out.println("not possible");
            return;
        }
        for(int i=0;i<arr.length;i+=2){
            swap(arr,i,i+1);
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}

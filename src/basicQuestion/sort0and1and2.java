package basicQuestion;

public class sort0and1and2 {
    static void swap(int [] arr,int st,int end){
        int temp = arr[st];
        arr[st] = arr[end];
        arr[end] = temp;
    }

    static void sort(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {

            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;

            } else if (arr[mid] == 1) {
                mid++;

            } else {
                swap(arr, mid, high);
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 2, 1, 1, 0, 1, 2, 0};
        sort(arr);
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}

package recursion.gfg;

public class MergeSort {
    static void merge(int[] arr, int left, int right, int mid){

        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right){
            if (arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid){
            temp[k++] = arr[i++];
        }

        while (j <= right){
            temp[k++] = arr[j++];
        }

        for (i = 0; i < temp.length; i++){
            arr[left + i] = temp[i];
        }
        System.out.println();
    }
    static void mergeSort(int[] arr, int left, int right){

        if (left >= right){
            return;
        }

        int mid = left + (right - left) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        merge(arr, left, right, mid);
    }
    public static void main(String[] args) {

        int[] arr = {38, 12, 27, 43, 9, 31, 18, 25};

//        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        mergeSort(arr, 0, arr.length - 1);

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}

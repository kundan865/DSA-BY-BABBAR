package recursion.gfg;

public class QuickSort {
    static int partition(int[] arr, int left, int right){

        int pivotElement = arr[left];

        int count = 0;

        for (int i = left + 1; i <= right; i++) {

            if(arr[i] <= pivotElement) {
                count ++;
            }

        }

        int correctPosition = left + count;

        int temp = arr[correctPosition];
        arr[correctPosition] = arr[left];
        arr[left] = temp;

        int i = left;
        int j = right;

        while (i < correctPosition && j > correctPosition){

            while (arr[i] <= pivotElement){
                i++;
            }

            while (arr[j] > pivotElement){
                j--;
            }

            if (i < correctPosition && j > correctPosition){
                int temp1 = arr[i];
                arr[i] = arr[j];
                arr[j] = temp1;
            }

        }
        return correctPosition;
    }
    static void quickSort(int[] arr, int left, int right){

        if (left < right){
            int pivotIndex = partition(arr, left, right);

            quickSort(arr, left, pivotIndex - 1);

            quickSort(arr, pivotIndex + 1, right);
        }
    }
    public static void main(String[] args) {
//        int[] arr = {10, 7, 8, 9, 1, 5};
        int[] arr = {4, 1, 3, 9, 7};
        quickSort(arr, 0, arr.length - 1);

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}

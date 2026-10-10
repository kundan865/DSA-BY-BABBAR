package recursion.gfg;

public class CountInversions {
    static long merge(int[] arr, int left, int right , int mid){

        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;
        long count = 0;

        while(i <= mid && j <= right){

            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];

                count += (mid - i + 1);
            }
        }

        while (i <= mid){
            temp[k++] = arr[i++];
        }

        while (j <= right){
            temp[k++] = arr[j++];
        }

        for (i=0; i < temp.length; i++){
            arr[left + i] = temp[i];
        }

        return count;
    }
    static long mergeSort(int[] arr, int left, int right){
        if(left >= right){
            return 0;
        }

        int mid = left + (right - left) / 2;

        long count = 0;
        count += mergeSort(arr, left, mid);
        count += mergeSort(arr, mid + 1, right);

        count += merge(arr, left, right, mid);
        return count;
    }
    static long countInversions(int[] arr){
        return mergeSort(arr, 0, arr.length-1);
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        long ans = countInversions(arr);
        System.out.println("ans = "+ans);
    }
}

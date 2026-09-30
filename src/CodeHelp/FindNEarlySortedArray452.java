package CodeHelp;

public class FindNEarlySortedArray452 {
    static int search(int[] arr , int target){

        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;
            if(mid - 1 > 0 && arr[mid - 1] == target){
                return mid - 1;
            } else if (arr[mid] == target) {
                return mid;
            } else if (mid + 1 < n && arr[mid+1] == target) {
                return mid + 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr = {3,5,9,10,11};
        int target = 10;
        int ans = search(arr,target);
        System.out.println("ans  = "+ans);
    }
}

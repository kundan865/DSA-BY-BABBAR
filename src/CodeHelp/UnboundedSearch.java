package CodeHelp;

public class UnboundedSearch {
    static int search(int[] arr, int target){
        int left  = 0;
        int right  = 1;
        while(arr[right] < target){
            left = right;
            right *= 2;
        }
        System.out.println("left = "+left+" right = "+right);

        while(left <= right){

            int mid = left + (right - left) / 2;
            if(arr[mid] == target){
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr ={1,3,5,7,9,12,15,18,19,20,21,22,23,24,26,29,30};
        int target = 20;
        int ans = search(arr, target);
        System.out.println("ans = "+ans);
    }
}

package gfg;

public class PainterPartition {
    static boolean isPossible(int[] nums,int mid , int k){
        int painters = 1;
        int maxBoards = mid;
        int boards = 0;

        for(int ele : nums){
            if(ele > maxBoards){
                return false;
            }
            if(boards + ele <= maxBoards){
                boards += ele;
            } else {
                painters++;
                if(painters > k){
                    return false;
                }
                boards = ele;
            }
        }
        return true;
    }
    static int painters(int[] nums,int k){
        int left = 0;
        int right = 0;
        int ans = -1;

        for(int ele : nums){
            right += ele;
            left = Math.max(ele , left);
        }

        while (left <= right){
            int mid = left + (right - left) / 2;
            if(isPossible(nums,mid,k)){
                right = mid - 1;

                ans = mid;
            } else {
                left = mid + 1;

            }
        }
        return ans;
    }
    public static void main(String[] args) {
//        int [] arr = {5,10,30,20,15};
//        int k = 3;

//        int arr[] = {10, 20, 30, 40};
//        int k = 2;

        int[] arr = {100, 200, 300, 400};
        int k = 1;
        int ans = painters(arr,k);
        System.out.println("ans = "+ans);
    }
}

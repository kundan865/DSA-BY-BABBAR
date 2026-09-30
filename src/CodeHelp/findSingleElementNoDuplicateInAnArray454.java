package CodeHelp;

public class findSingleElementNoDuplicateInAnArray454 {
    static int search(int[] nums){

        int n = nums.length;
        int left = 0;
        int right = n - 1;

        while(left < right){
            int mid = left + (right - left) / 2;
            if(mid % 2 != 0){
                mid--;
            }

            if(nums[mid] == nums[mid+1]){
                left = mid + 2;
            }else {
                right = mid;
            }
        }
        return nums[left];
    }
    public static void main(String[] args) {
        int []nums = {1,1,2,2,3,4,4,5,5};
        int ans = search(nums);
        System.out.println("ans = "+ans);
    }
}

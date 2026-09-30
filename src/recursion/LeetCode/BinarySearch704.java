package recursion.LeetCode;

public class BinarySearch704 {
    static int search(int[] nums,int left,int right,int target){

        if(left > right){
            return -1;
        }

        int mid = left + (right - left) / 2;

        if(nums[mid] == target){

            return mid;

        } else if (nums[mid] < target) {

            return search(nums,mid+1,right,target);

        } else {

            return search(nums,left,mid -1,target);
        }

    }
    public static void main(String[] args) {

        int[] nums = {-1,0,3,5,9,12};
        int target = 9;

//        int[] nums = {-1,0,3,5,9,12};
//        int target = 2;

        int left = 0;
        int right = nums.length - 1;

        int ans = search(nums,left,right,target);
        System.out.println("ans = "+ans);
    }
}

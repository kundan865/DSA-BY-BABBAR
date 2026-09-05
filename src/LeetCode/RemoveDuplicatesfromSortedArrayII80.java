package LeetCode;

public class RemoveDuplicatesfromSortedArrayII80 {
    public static int removeDuplicates(int[] nums) {

        int k = 0;

        for (int num : nums) {

            if (k < 2 || num != nums[k - 2]) {
                nums[k] = num;
                k++;
            }
        }

        return k;
    }
    public static void main(String[] args) {
        int nums [] = {1,1,1,2,2,3};

        int ans = removeDuplicates(nums);
        for(int ele : nums){
            System.out.print(ele+" ");
        }
        System.out.println("ans = "+ans);
    }
}

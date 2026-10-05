package basicQuestion;

import static Math.Math.swap;

public class SelectionSort {
    static void selectionSort(int []nums){
        int n = nums.length;

        for(int i = 0; i < n; i++){
            int minIndex = i;
            for(int j = i + 1; j < n; j++){
                if(nums[j] < nums[minIndex]){
                    minIndex = j;
                }
            }
            swap(nums,minIndex,i);
        }
    }
    public static void main(String[] args) {
        int [] nums = {1,9,4,2,6,3,5,8,7};

        selectionSort(nums);

        for(int ele : nums){
            System.out.print(ele+" ");
        }
    }
}

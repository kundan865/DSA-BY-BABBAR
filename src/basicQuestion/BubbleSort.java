package basicQuestion;

import static basicQuestion.Math.swap;

public class BubbleSort {
    static void bubbleSort(int []nums){
        int n = nums.length;
        for(int i =0;i<n;i++){
            boolean swapped = false;
            for(int j = 0;j<n-1;j++){
                if(nums[j]>nums[j+1]){

                    swap(nums,j,j+1);
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int [] nums = {1,9,4,2,6,3,5,8,7};

        bubbleSort(nums);

        for(int ele : nums){
            System.out.print(ele+" ");
        }
    }
}

package basicQuestion.sortAlgo;

public class InsertionSort {
    static void insertionSort(int []nums){
        int n = nums.length;
        for(int i = 1; i < n; i++){
            int key = nums[i];
            int j = i - 1;

            while(j >= 0 && nums[j] > key){
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        int [] nums = {1,9,4,2,6,3,5,8,7};

        insertionSort(nums);

        for(int ele : nums){
            System.out.print(ele+" ");
        }
    }
}

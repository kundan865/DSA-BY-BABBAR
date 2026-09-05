package LeetCode;

public class RotateImage48 {
    static void swap(int []arr,int st,int end){
        int temp = arr[st];
        arr[st] = arr[end];
        arr[end] = temp;
    }
    static void transpose(int[][] arr){

        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    public static void rotateImage(int[][] matrix) {
        transpose(matrix);
        for(int[] ints : matrix){
            int left = 0;
            int right = ints.length-1;

            while(left < right){
                swap(ints,left,right);
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int n = arr.length;
        rotateImage(arr);
        for (int[] ints : arr) {
            for (int j = 0; j < n; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}

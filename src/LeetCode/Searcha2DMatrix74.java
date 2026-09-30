package LeetCode;

public class Searcha2DMatrix74 {
    static boolean search(int[][] mat ,int target){
        int rows = mat.length;     //   3
        int cols = mat[0].length;  //   4
        int left = 0;
        int right = rows * cols - 1;

        while(left <= right){

            int mid = left + (right - left) / 2;
            int row = mid / cols;
            int col = mid % cols;

            if(mat[row][col] == target){
                return true;
            } else if (mat[row][col] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [][]mat = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };

        int target = 23;
        boolean ans = search(mat,target);
        System.out.println("ans = "+ans);
    }
}

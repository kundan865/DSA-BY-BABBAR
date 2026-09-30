package LeetCode;

public class Searcha2DMatrixII240 {
    static boolean search(int[][] mat, int target){

        int rows = mat.length;
        int cols = mat[0].length;

        int row = 0;
        int col = cols - 1;


        while(row < rows && 0 <= col ){

            if(mat[row][col] == target){

                return true;
            } else if (mat[row][col] < target) {

                row ++;

            } else{

                col --;
            }
        }
        return false;
    }
    public static void main(String[] args) {
//        int[][] mat ={
//                {1,4,7,11,15},
//                {2,5,8,12,15},
//                {3,6,9,16,22},
//                {10,13,14,17,24},
//                {18,21,23,26,30}
//        };

//        int[][] mat = {
//                {1, 4, 7, 11, 15},
//                {2, 5, 8, 12, 19},
//                {3, 6, 9, 16, 22},
//                {10, 13, 14, 17, 24},
//                {18, 21, 23, 26, 30}
//        };
//        int target = 20;

        int[][] mat = {{-5}};
        int target = -5;

        boolean ans = search(mat,target);
        System.out.println("ans  = "+ans);
    }
}

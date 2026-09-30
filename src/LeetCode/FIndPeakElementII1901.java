package LeetCode;

public class FIndPeakElementII1901 {
    public static int[] findPeakGrid(int[][] mat) {

        int rows = mat.length;
        int cols = mat[0].length;

        int left = 0;
        int right = cols - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            // Find maximum element in this column
            int maxRow = 0;

            for (int i = 1; i < rows; i++) {
                if (mat[i][mid] > mat[maxRow][mid]) {
                    maxRow = i;
                }
            }

            // Left and right values
            int leftValue = mid > 0 ? mat[maxRow][mid - 1] : -1;
            int rightValue = mid < cols - 1 ? mat[maxRow][mid + 1] : -1;

            // Peak found
            if (mat[maxRow][mid] > leftValue &&
                    mat[maxRow][mid] > rightValue) {

                return new int[]{maxRow, mid};
            }

            // Move toward the larger side
            if (leftValue > mat[maxRow][mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
//       int[][] mat = {{1,4},{3,2}};
        int [][]mat = {
                {10,20,15},
                {21,30,14},
                {7,16,32}
        };
       int ans[] = findPeakGrid(mat);
        for(int ele : ans){
            System.out.print(ele+" ");
        }
    }
}

package CodeHelp;

public class RowWithMaximumOnes496 {
    static int search(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        int firstOne = arr.length;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == 0) {
                left = mid + 1;
            } else {
                firstOne = mid;
                right = mid - 1;
            }
        }

        return firstOne;
    }
    static int rowWithMaxOnes(int[][] mat){
        int maxOnes = Integer.MIN_VALUE;
        int ans = -1;
        for(int i = 0; i < mat.length; i++){
            int firstOne = search(mat[i]);
            int ones = mat.length - firstOne;
            if(ones > maxOnes){
                maxOnes = ones;
                ans = i;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int[][] mat = {
                {0,0,0,0},
                {0,0,1,1},
                {0,1,1,1},
                {1,1,1,1}
        };

        int ans = rowWithMaxOnes(mat);
        System.out.println("ans = "+ans);
    }
}

package CodeHelp;

import java.util.ArrayList;
import java.util.List;

public class wavePrintAMatrix492 {
    static List<Integer> wavePrint(int[][] arr) {

        int row = arr.length;
        int col = arr[0].length;

        List<Integer> ans = new ArrayList<>();

        for (int j = 0; j < col; j++) {

            if (j % 2 == 0) {

                // Down
                for (int i = 0; i < row; i++) {
                    ans.add(arr[i][j]);
                }

            } else {

                // Up
                for (int i = row - 1; i >= 0; i--) {
                    ans.add(arr[i][j]);
                }
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int [][] arr ={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        List<Integer> ans = wavePrint(arr);
        System.out.println(ans);
    }
}

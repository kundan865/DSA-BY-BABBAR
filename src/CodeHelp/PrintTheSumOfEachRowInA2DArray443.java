package CodeHelp;

import java.util.ArrayList;
import java.util.List;

public class PrintTheSumOfEachRowInA2DArray443 {
    static List<Integer> sumEachRow(int[][] arr){
        List<Integer> ans = new ArrayList<>();
        int row = arr.length;
        int col = arr[0].length;

        for(int i = 0; i < row; i++){
            int sum = 0;
            for(int j = 0; j < col; j++){
                sum += arr[i][j];
            }
            ans.add(sum);
        }

        return ans;
    }
    public static void main(String[] args) {
        int [][] arr ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        List<Integer> ans = sumEachRow(arr);
        System.out.println(ans);
    }
}

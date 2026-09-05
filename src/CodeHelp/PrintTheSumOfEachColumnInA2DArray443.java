package CodeHelp;

import java.util.ArrayList;
import java.util.List;

public class PrintTheSumOfEachColumnInA2DArray443 {
    static List<Integer> sumEachCol(int [][]arr){
        int row = arr.length;
        int col = arr[0].length;
        List<Integer> ans = new ArrayList<>();
        for(int j = 0; j < col; j++){
            int sum = 0;
            for(int i = 0; i < row; i++){
                sum += arr[i][j];
            }
            ans.add(sum);
        }
        return ans;
    }
    public static void main(String[] args) {
        int [][] arr ={
                {1,2,3,4,5,6},
                {7,8,9,10,11,12},
                {13,14,15,16,17,18}
        };
        List<Integer> ans = sumEachCol(arr);
        System.out.println(ans);
    }
}

package CodeHelp;

public class transposeMatrix444 {
    static int [][] transpose(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;
        int [][]ans = new int[col][row];

        for(int i=0;i<col;i++){
            for(int j = 0;j<row;j++){
                ans[i][j]= arr[j][i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        int [][]ans = transpose(arr);
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}

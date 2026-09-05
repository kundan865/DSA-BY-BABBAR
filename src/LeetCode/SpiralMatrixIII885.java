package LeetCode;

public class SpiralMatrixIII885 {
    public static int[][] spiral(int rows, int cols, int rStart, int cStart) {

        int [][]ans = new int[rows * cols][2];
        int row = rStart;
        int col =  cStart;
        int index = 0;
        ans[index++] = new int[]{row,col};
        int step = 1;

        while(index < rows * cols){

            //  right
            for(int i=0;i<step;i++){
                col++;
                if(row >=0 && row < rows && col >= 0 && col < cols){
                    ans[index++] = new int[]{row,col};
                }
            }
            // down
            for(int i=0;i<step;i++){
                row++;
                if(row >0  && row < rows && col >= 0 && col < cols){
                    ans[index++] = new int[]{row,col};
                }
            }
            step++;

            // left
            for(int i=0;i<step;i++){
                col--;
                if(row >= 0 && row < rows && col >= 0 && col < cols){
                    ans[index++] = new int[]{row,col};
                }
            }
            for(int i=0;i<step;i++){
                row--;
                if(row >= 0 && row < rows && col >= 0 && col < cols){
                    ans[index++] = new int[]{row,col};
                }
            }
            step++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int rows = 5;
        int cols = 6;
        int rStart = 1;
        int cStart = 4;
        int [][]ans = spiral(rows,cols,rStart,cStart);

        for (int[] an : ans) {
            System.out.println(an[0] + " " + an[1]);
        }
    }
}

package recursion.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens51 {
    static boolean isSafeToPlace(char[][] board, int rowIndex, int colIndex,int n){

        // left horizontal check
        int row = rowIndex;
        int col = colIndex;

        while (col >= 0){
            if(board[row][col] == 'Q'){
                return false;
            }
            col--;
        }

        // left upper diagonal check
        row = rowIndex;
        col = colIndex;
        while (col >= 0 && row >= 0){
            if(board[row][col] == 'Q'){
                return false;
            }
            row --;
            col --;
        }

        // left lower diagonal check
        row = rowIndex;
        col = colIndex;
        while (col >= 0 && row < n){
            if(board[row][col] == 'Q'){
                return false;
            }
            row ++;
            col --;
        }
        return true;
    }
    static void solve(char[][] board, int colIndex, int n, List<List<String>> ans){

        if(colIndex >= n){
            List<String> temp = new ArrayList<>();
            for (int i = 0; i < n; i++){
                temp.add(new String(board[i]));
            }
            ans.add(temp);
            return;
        }

        for (int rowIndex = 0; rowIndex < n; rowIndex++){
            if(isSafeToPlace(board,rowIndex,colIndex,n)){
                board[rowIndex][colIndex] = 'Q';
                solve(board, colIndex+1, n, ans);
                board[rowIndex][colIndex] = '.';
            }
        }
    }
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++){
            Arrays.fill(board[i],'.');
        }

        List<List<String>> ans = new ArrayList<>();
        int colIndex = 0;

        solve(board, colIndex, n, ans);

        System.out.println(ans);


    }
}

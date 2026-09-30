package recursion.LeetCode;

public class SudokuSolver37 {

    static boolean isSafeToPlace(char[][]board, int row, int col, char num){

        // check horizontally
        for (int j = 0; j < 9; j++){

            if (board[row][j] == num){

                return false;
            }
        }

        // check vertically

        for (int i = 0; i < 9; i++){

            if (board[i][col] == num){

                return false;
            }
        }

        int startRow = row - row % 3;
        int startCol = col - col % 3;

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (board[startRow+i][startCol+j] == num){
                    return false;
                }
            }
        }
        return true;
    }
    static boolean solve(char[][] board){

        for (int row = 0; row < 9; row++){

            for (int col = 0; col < 9; col++){

                if(board[row][col] == '.'){

                    for (char num = '1'; num <= '9'; num++){

                        if (isSafeToPlace(board, row, col, num)){

                            board[row][col] = num;

                            if(solve(board)){
                                return true;
                            }

                            board[row][col] = '.';

                        }
                    }

                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'} ,
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'} ,
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'} ,
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'} ,
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'} ,
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'} ,
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'} ,
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'} ,
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'} ,
        };

        solve(board);


        for (char[] chars : board) {
            for (int j = 0; j < 9; j++) {
                System.out.print(chars[j] + " ");
            }
            System.out.println();
        }
    }
}

//        5 3 4 6 7 8 9 1 2       5 3 2 6 7 4 9 1 8
//        6 7 2 1 9 5 3 4 8       6 7 3 1 9 5 8 4 2
//        1 9 8 3 4 2 5 6 7       1 9 8 3 4 2 5 6 7
//        8 5 9 7 6 1 4 2 3       8 5 9 7 6 1 4 2 3
//        4 2 6 8 5 3 7 9 1       4 2 6 8 5 3 7 9 1
//        7 1 3 9 2 4 8 5 6       7 1 4 9 2 8 3 5 6
//        9 6 1 5 3 7 2 8 4       9 6 1 5 3 7 2 8 4
//        2 8 7 4 1 9 6 3 5       2 8 7 4 1 9 6 3 5
//        3 4 5 2 8 6 1 7 9       3 4 5 2 8 6 1 7 9

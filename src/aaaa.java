
public class aaaa {
    static boolean isSafeToPlace(char[][] board, int row, int col, char num) {

        // Row check
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == num) {
                return false;
            }
        }

        // Column check
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }

        // 3 x 3 box check
        int startRow = row - row % 3;
        int startCol = col - col % 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[startRow + i][startCol + j] == num) {
                    return false;
                }
            }
        }

        return true;
    }
     static boolean solve(char[][] board) {

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {

                // Empty cell मिला
                if (board[row][col] == '.') {

                    // 1 से 9 तक try करो
                    for (char num = '1'; num <= '9'; num++) {

                        if (isSafeToPlace(board, row, col, num)) {

                            // Number डालो
                            board[row][col] = num;

                            // आगे solve करो
                            if (solve(board)) {
                                return true;
                            }

                            // गलत choice थी -> वापस खाली
                            board[row][col] = '.';
                        }
                    }

                    // कोई भी number काम नहीं किया
                    return false;
                }
            }
        }

        // कोई empty cell नहीं बचा
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

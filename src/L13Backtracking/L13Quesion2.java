package L13Backtracking;

public class L13Quesion2 {

    public static void main(String[] args) {

        //Q1 N-Queens

        boolean[][] board = new boolean[4][4];
        NQueens(board, 0, 0, 0, board.length, "");
 
    }

    public static void NQueens(boolean[][] board, int row, int col, int qpsf, int tq, String ans) {

        if(qpsf == tq) {
            System.out.println(ans);
            return;
        }

        if(col == board[0].length){
            row++;
            col = 0;
        }

        if(row == board.length){
            return;
        }

        if(isItSafeToPlaceTheQueen(board, row, col)){

            //do
            board[row][col] = true;
            NQueens(board, row + 1, 0, qpsf + 1, tq, ans + "{" + row + "-" + col + "}");
            board[row][col] = false;
        }

        NQueens(board, row, col + 1, qpsf, tq, ans);

    }

    private static boolean isItSafeToPlaceTheQueen(boolean[][] board, int row, int col) {

        //vertical upwards
        int r = row - 1;
        int c = col;

        while(r >= 0){
            if(board[r][c]){
                return false;
            }

            r--;
        }

        //horizontal left
        r = row;
        c = col - 1;

        while(c >= 0){
            if(board[r][c]){
                return false;
            }

            c--;
        }

        //diagonally left
        r = row - 1;
        c = col - 1;

        while(r >= 0 && c >= 0){
            if(board[r][c]){
                return false;
            }

            r--;
            c--;
        }

        //diagonally right
        r = row - 1;
        c = col + 1;

        while(r >= 0 && c < board[0].length){
            if(board[r][c]){
                return false;
            }
            r--;
            c++;
        }

        return true;

    }

}

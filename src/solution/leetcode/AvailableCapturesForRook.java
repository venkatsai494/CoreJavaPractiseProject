package solution.leetcode;

public class AvailableCapturesForRook {
    public static void main(String[] args) {
        AvailableCapturesForRook solution = new AvailableCapturesForRook();
        char[][] board1 = {
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', 'p', '.', '.', '.', '.'},
                {'.', '.', '.', 'R', '.', '.', '.', 'p'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', 'p', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'}
        };
        System.out.println(solution.numRookCaptures(board1)); // Output: 3

        char[][] board2 = {
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', 'p', 'p', 'p', 'p', 'p', '.', '.'},
                {'.', 'p', 'p', 'B', 'p', 'p', '.', '.'},
                {'.', 'p', 'B', 'R', 'B', 'p', '.', '.'},
                {'.', 'p', 'p', 'B', 'p', 'p', '.', '.'},
                {'.', 'p', 'p', 'p', 'p', 'p', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'}
        };
        System.out.println(solution.numRookCaptures(board2)); // Output: 0

        char[][] board3 = {
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', 'p', '.', '.', '.', '.'},
                {'.', '.', '.', 'p', '.', '.', '.', '.'},
                {'p', 'p', '.', 'R', '.', 'p', 'B', '.'},
                {'.', '.', '.', 'B', '.', '.', '.', '.'},
                {'.', '.', '.', 'p', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'}
        };
        System.out.println(solution.numRookCaptures(board3)); // Output: 3
    }
    public int numRookCaptures(char[][] board) {
        int capture = 0;
        int rookRow = 0;
        int rookCol = 0;
        for(int i = 0; i< board.length; i++){
            for(int j = 0; j<board[0].length; j++){
                if(board[i][j] == 'R'){
                    rookRow = i;//2
                    rookCol = j;//3
                }
            }
        }
        for(int i = rookCol; i < board.length; i++){
            if(board[rookRow][i] == 'p'){
                capture++;
                break;
            }
            else if(board[rookRow][i] == 'B'){
                break;
            }
        }
        for(int i = rookCol; i >=0; i--){
            if(board[rookRow][i] == 'p'){
                capture++;
                break;
            }
            else if(board[rookRow][i] == 'B'){
                break;
            }
        }
        for(int i = rookRow; i < board[0].length; i++){
            if(board[i][rookCol] == 'p'){
                capture++;
                break;
            }
            else if(board[i][rookCol] == 'B'){
                break;
            }
        }
        for(int i = rookRow; i >=0; i--){
            if(board[i][rookCol] == 'p'){
                capture++;
                break;
            }
            else if(board[i][rookCol] == 'B'){
                break;
            }
        }
        return capture;
    }
}

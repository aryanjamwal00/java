public class Sudoku {
    static boolean isSafeToPlace(char[][] board,char charValue,int rowIndex,int colIndex){
        //rules;
        //check for horizontal or same row
        //rowIndex sab cel k liya same rahega
        //and col k index 0 to <9 tak move krega
        for(int col=0;col<9;col++){
            if(board[rowIndex][col] == charValue){
                return false;
            }
        }
        //check for vertical or same column
        //colIndex sab cell k same
        //rowIndex 0 to <9
        for(int row=0;row<9;row++){
            if(board[row][colIndex] == charValue){
                return false;
            }
        }
        //check for current 3*3 wala sub box
        //isme dimag lgega
        int startRow = rowIndex - rowIndex%3;
        int startCol = colIndex - colIndex%3;
        //travel over that 3*3 wala sub box
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                int actualRow = startRow + i;
                int actualCol = startCol + j;
                if(board[actualRow][actualCol] == charValue){
                    return false;
                }
            }
        }
        //iska mtlb safe to place hai
        return true;
    }
    static boolean findEmptyCell(char[][] board,int[] emptyCell){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j] == '.'){
                    //store empty cell ki row
                    emptyCell[0]=i;
                    //store empty cell ki col
                    emptyCell[1]=j;
                    return true;
                }
            }
        }
        //kahi pr bhi empty cell nhi mila toh line 14 pe aaunga
        return false;
    }
    static boolean solveSudokuHelper(char[][] board){
        //base case
        //mein tab mannunga k mere puzzle solved hai,jab saare empty space fill hogye honge
        //when there is no empty space inside the board,then the problem is solved
        int[] emptyCell = new int[2];
        if(!findEmptyCell(board,emptyCell)){
            return true;
        }
        //lets say muje empty cell mil gya
        int rowIndex = emptyCell[0];
        int colIndex = emptyCell[1];
        for(int value=1;value<=9;value++){
            char charValue = (char)(value + '0');
            if(isSafeToPlace(board,charValue,rowIndex,colIndex)){
                //place krdo
                board[rowIndex][colIndex] = charValue;
                //baaki recursion sambhal lega
                if(solveSudokuHelper(board)==true){
                    return true;
                }
                //agar recursion solve nhi kr paya,or wapas aa gya
                //current value ko undo kr do or backtracking wala step karo
                board[rowIndex][colIndex] = '.';
            }
        }
        //not able to solve the problem
        return false;
    }
    static void SolveSudoku(char[][] board){
        solveSudokuHelper(board);
    }
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        System.out.println("Original Board:");
        printBoard(board);

        // Call the void method directly. It modifies the board in-place.
        SolveSudoku(board);

        System.out.println("\nSolved Board:");
        printBoard(board);
    }

    // Helper method to print the 9x9 board
    static void printBoard(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}

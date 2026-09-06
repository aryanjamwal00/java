import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens {
    static boolean isSafeToPlace(int rowIndex,int colIndex,char[][] board){
        int r=rowIndex;
        int c=colIndex;
        //check left horizontal
        while(c >= 0){
            if(board[r][c] == 'Q'){
                return false;
            }
            //row index no change
            //col index travel till 0
            c--;
        }
        r=rowIndex;
        c=colIndex;
        //check left upper diagonal
        while(r >= 0 && c >= 0){
            if(board[r][c] == 'Q'){
                return false;
            }
            r--;
            c--;
        }
        r=rowIndex;
        c=colIndex;
        //check left lower diagonal
        while(r < board.length && c >= 0){
            if(board[r][c] == 'Q'){
                return false;
            }
            r++;
            c--;
        }
        return true;
    }
    static void solve(char[][] board,int n,int colIndex,List<List<String>> ans) {
        //base case
        if(colIndex >= n){
            //iska mtlb board pr mereko ek valid argument mil gyi h
            List<String> temp = new ArrayList<>();
            for(int i = 0; i < n; i++){
                temp.add(new String(board[i]));
            }
            ans.add(temp);
            return;
        }
        //ek case mein dekhta hu,baaki recursion smbhal lega
        //current column k har cell pr jaake ya current col k
        //har row pe jaake queen place krunga and rest recursion ko de dunga
        for(int rowIndex = 0; rowIndex < n; rowIndex++){
            if(isSafeToPlace(rowIndex,colIndex,board)){
                //place queen
                board[rowIndex][colIndex] = 'Q';
                //baaki recursion ko de do
                solve(board,n,colIndex+1,ans);
                //important-->undo ya backtracking valla step
                board[rowIndex][colIndex] = '.';
            }
        }
    }
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        int colIndex = 0;
        solve(board,n,colIndex,ans);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(solveNQueens(5));
    }
}

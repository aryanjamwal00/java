import java.util.Arrays;

public class TransposeAMatrix2D {
    public static int[][] matrixTranspose(int[][] matrix){
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return new int[0][0];
        }
        int row = matrix.length;
        int col = matrix[0].length;

        int[][] ans = new int[col][row];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] ans = matrixTranspose(matrix);
        System.out.println("Transpose of "+ Arrays.deepToString(matrix) +"is: "+ Arrays.deepToString(ans));
    }
}

import java.util.Arrays;

public class MatrixTranspose {
    static int[][] matrixTranspose(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return new int[0][0];
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] ans = new int[cols][rows];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    ans[j][i] = matrix[i][j];
                }
            }
        return ans;
    }
    public static void main(String[] args) {
        int[][] ans = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int[][] transpose = matrixTranspose(ans);
        System.out.println(Arrays.deepToString(transpose));
    }
}

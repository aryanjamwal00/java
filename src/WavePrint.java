import java.util.ArrayList;
import java.util.List;

public class WavePrint {
    static List<Integer> wavePrintMatrix(int[][] matrix){
        List<Integer> list = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;

        if((m & 1) == 1){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    list.add(matrix[i][j]);
                }
            }
        }
        else {
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    list.add(matrix[i][j]);
                }
            }
        }
        return list;
    }
    static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> list = wavePrintMatrix(matrix);
        System.out.println(list);
    }
}

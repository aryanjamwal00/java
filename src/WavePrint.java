import java.util.ArrayList;
import java.util.List;

public class WavePrint {
    static List<Integer> wavePrintMatrix(int[][] matrix,int m,int n){
        List<Integer> list = new ArrayList<>();
        for(int col=0;col<n;col++){
            if((col & 1)==1){
                for(int row=m-1;row>=0;row--){
                    list.add(matrix[row][col]);
                }
            }
            else{
                for(int row=0;row<m;row++){
                    list.add(matrix[row][col]);
                }
            }
        }
        return list;
    }
    static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> list = wavePrintMatrix(matrix,3,3);
        System.out.println(list);
    }
}

import java.util.ArrayList;
import java.util.List;

public class SpiralPrintAMatrix {
    static List<Integer> spiralOrder(int[][] matrix){
        List<Integer> list = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        int startingRow = 0;
        int StartingCol = 0;
        int endingRow = n-1;
        int endingCol = m-1;

        while(startingRow<=endingRow && StartingCol<=endingCol) {
            //printing starting row
            for (int col = StartingCol; col <= endingCol; col++) {
                list.add(matrix[startingRow][col]);
            }
            startingRow++;
            //printing endingcol
            for (int row = startingRow; row <= endingRow; row++) {
                list.add(matrix[row][endingCol]);
            }
            endingCol--;
            //print ending row
            if (startingRow <= endingRow) {
                for (int col = endingCol; col >= StartingCol; col--) {
                    list.add(matrix[endingRow][col]);
                }
                endingRow--;
            }
            //print staring col
            if (StartingCol <= endingCol) {
                for (int row = endingRow; row >= startingRow; row--) {
                    list.add(matrix[row][StartingCol]);
                }
                StartingCol++;
            }
        }

        return list;
    }
    public static void main(String[] args) {
        int[][] matrix ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
        List<Integer> list=spiralOrder(matrix);
        System.out.println(list);
    }
}

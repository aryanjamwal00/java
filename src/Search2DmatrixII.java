public class Search2DmatrixII {
    static boolean searchMatrixII(int[][] matrix,int target){
        int totalRows=matrix.length;
        int totalCols=matrix[0].length;

        int rows=0;
        int cols=totalCols-1;

        while(rows < totalRows && cols >= 0){
            if(matrix[rows][cols]==target)
                return true;
            else if(matrix[rows][cols] > target){
                cols--;
            } else{//matrix[rows][cols] < target
                rows++;
            }
        }
        return false;
    }
    static void main(String[] args) {
        int[][] matrix={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        boolean ans=searchMatrixII(matrix,25);
        System.out.println("Element present in the matrix: " +ans);
    }
}

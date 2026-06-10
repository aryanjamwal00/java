public class Search2Dmatrix {
    static boolean searchMatrix(int[][] matrix,int target){
        int rowIndex=matrix.length;
        int colIndex=matrix[0].length;

        int n=rowIndex*colIndex;
        int s=0;
        int e=n-1;

        while(s<=e){
            int mid=s+(e-s)/2;
            int row=mid/colIndex;
            int col=mid%colIndex;

            if(matrix[row][col] == target){
                return true;
            } else if(matrix[row][col] > target){
                //move left
                e=mid-1;
            } else{
                //move right
                s=mid+1;
            }
        }
        return false;
    }

    static void main(String[] args) {
        int[][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        boolean ans=searchMatrix(matrix,13);
        System.out.println("Element present in the matrix: " +ans);
    }
}

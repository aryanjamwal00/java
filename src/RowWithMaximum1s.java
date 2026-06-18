public class RowWithMaximum1s {
    static int getFirstOccIndex(int[][] matrix,int rowIndex){
        int totalRow=matrix.length;
        int totalCol=matrix[0].length;
        int target=1;
        int ans = -1;
        //handling case where there is no 1 in the table
        if(matrix[rowIndex][totalCol-1] == 0){
            return totalCol;
        }else{
            //1 exist inside the row
            int s=0;
            int e=totalCol-1;
            while(s<=e){
                int mid=s+(e-s)/2;
                if(matrix[rowIndex][mid] == 0){
                    //move right
                    s=mid+1;
                }else{
                    //==1 valla casse
                    ans=mid;
                    //move left
                    e=mid-1;
                }
            }

        }
        return ans;

    }
    static int rowWithmaxones(int[][] matrix){
        //move to each row and for each row
        //find the first Occ
        //using the first occ will calculate the count of 1's
        //update the next variable or the ans index variable basis on that
        int maxi = 0;
        int maxOneWaliRowIndex = 0;
        int totalRow=matrix.length;
        int totalCol=matrix[0].length;

        for(int row=0;row<totalRow;row++){
            //for rach row find first occ
            int firstOccIndex = getFirstOccIndex(matrix,row);
            int oneCount = totalCol - firstOccIndex;

            if(oneCount > maxi){
                //possibility of current row as ans
                maxi = oneCount;
                maxOneWaliRowIndex = row;
            }
        }
        return maxOneWaliRowIndex;
    }
    static void main(String[] args) {
//        int[][] matrix = {{0,0,0,0,1,1},
//                          {0,0,0,0,0,1},
//                          {0,0,0,1,1,1},
//                          {0,0,1,1,1,1},
//                          {0,1,1,1,1,1},
//                          {0,0,0,0,0,0}};
        int[][] matrix = {{0,0,0,0,0,0}};
        int ans = rowWithmaxones(matrix);
        System.out.println("Row With MAX 1's is : " + ans);
    }
}

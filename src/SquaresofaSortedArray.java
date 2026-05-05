import java.util.Arrays;

public class SquaresofaSortedArray {
    static int[] SquaresOfArray(int[] arr){
//        int n=arr.length;
//        int i=0;
//        int j=n-1;
//        for(i=0;i<n;i++){
//            arr[i] = (arr[i] * arr[i]);
//        }
//        //Arrays.sort(arr);
//        return arr;
        int n = arr.length;
        int i=0;
        int j=n-1;
        //new array to avoid overwriting original values
        int[] res = new int[n];
        //separate index for resulting array
        int k=n-1;

        while(i<=j){
            int leftSquare = arr[i]*arr[i];
            int rightSquare = arr[j]*arr[j];

            if(leftSquare>rightSquare){
                res[k]=leftSquare;
                i++;
            }else{
                res[k]=rightSquare;
                j--;
            }
            k--;
        }
        return res;
    }
    static void main(String[] args) {
        int[] arr={-4,-1,0,3,10};
        int[] result = SquaresOfArray(arr);
        System.out.println(Arrays.toString(result));

    }
}

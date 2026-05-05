import java.util.Arrays;

public class MoveZeroes {
    static int[] moveZeroes(int[] arr){
//        int i = 0;
//        int n = arr.length;
//        int j = n - 1;
//        while(i < j){
//            if(arr[i] == 0){
//                //swap
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//                j--;
//                i++;
//                }
//            else {
//                i++;
//            }
//        }
//        return arr;
        int i = 0;
        int n = arr.length;

        for(int j=0;j<n;j++){
            if(arr[j] != 0){
                arr[i] = arr[j];
                i++;
            }
        }
        while(i<n){
            arr[i] = 0;
            i++;
        }
        return arr;
    }
    static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        int result[] = moveZeroes(arr);
        System.out.println(Arrays.toString(result));

    }
}

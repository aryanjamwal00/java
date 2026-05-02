import java.util.Arrays;

public class FindPivotElement {
    static int findPivotElement(int[] arr) {
        int n = arr.length;
        int rightSum[] = new int[n];
        int leftSum[] = new int[n];

        leftSum[0] = arr[0];
        for(int i=1;i<n;i++){
            leftSum[i] = leftSum[i-1] + arr[i];
        }
        rightSum[n-1] = arr[n-1];
        for(int j=n-2;j>=0;j--){
            rightSum[j] = rightSum[j+1] + arr[j];
        }
        for(int i=0;i<n;i++){
            if(leftSum[i] == rightSum[i]){
                return arr[i];// agr sirf index chaiye tho hum arr[i] ko replace kr denge i sa
            }
        }
        return -1;
    }
    static void main(String[] args) {
        int arr[] = {1,7,6,3,5};
        int ans = findPivotElement(arr);
        System.out.println(ans);
    }
}

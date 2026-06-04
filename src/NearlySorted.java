import java.sql.SQLOutput;

public class NearlySorted {
    static int nearlySortedArray(int[] arr,int K){
        int n=arr.length;
        int s=0;
        int e=n-1;

        while(s<=e){
            int mid=s+(e-s)/2;

            if(arr[mid]-1 >= 0 && arr[mid]-1 == K)
                return arr[mid]-1;
            if(arr[mid] == K)
                return mid;
            if(arr[mid]+1 < n && arr[mid]+1 == K)
                return arr[mid]+1;

            if(arr[mid] > K){
                e=mid-2;
            }
            else{
                //arr[mid] < K
                s=mid+1;
            }
        }
        return -1;
    }
    static void main(String[] args) {
        int ans=nearlySortedArray(new int[]{3,2,4,5,7,6}, 4);
        System.out.println(ans);
    }
}

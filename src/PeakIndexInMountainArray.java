public class PeakIndexInMountainArray {
    static int peakIndex(int[] arr){
        int n=arr.length;
        int s=0;
        int e=n-1;
        int ans=-1;

        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid] >= arr[mid+1]){
                ans=mid;
                e=mid-1;
            } else{
                //arr[mid] < arr[mid+1]
                s=mid+1;
            }
        }
        return ans;
    }
    static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,45,35,25};
        int ans = peakIndex(arr);
        System.out.println("Peak Index of array: " +ans);
    }
}

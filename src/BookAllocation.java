public class BookAllocation {
    static boolean isAnsValid(int arr[],int k,int mid){
        int studentCount=1;
        int pages=0;

        for(int i=0;i<arr.length;i++){
            if(pages + arr[i] <= mid){
                pages += arr[i];
            }
            else{
                studentCount++;
                if(studentCount > k || arr[i] > mid){
                    return false;
                }
                else{
                    pages = 0;
                    pages += arr[i];
                }
            }
        }
        return true;
    }
    static int bookAllocation(int[] arr, int k) {
        if(arr.length < k){
            return -1;
        }
        int n = arr.length;
        int s=0;
        int sum=0;

        for(int i=0;i<n;i++){
            sum += arr[i];
        }
        int e=sum;
        int ans=-1;

        while(s<=e){
            int mid=s+(e-s)/2;

            if(isAnsValid(arr,k,mid)){
                ans=mid;
                e=mid-1;
            }
            else{
                //right move krenge
                s=mid+1;
            }
        }
        return ans;
    }
    static void main(String[] args) {
        int[] arr={12,34,67,90};
        int k=2;
        System.out.println("Max pages read by a particular student: " + bookAllocation(arr,k));
    }
}

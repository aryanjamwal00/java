public class SqrtUsingBinarySearch {
//    static int sqrt(int[] arr,int target){
//        int n=arr.length;
//        int start=0;
//        int end=n-1;
//
//        while(start<=end){
//            int mid=start+(end-start)/2;
//            if(arr[mid]==target){
//                int ans=(int)Math.sqrt(arr[mid]);
//                return ans;
//            }else if(arr[mid]<target){
//                start=mid+1;
//            }else{
//                //arr[mid]>target
//                end=mid-1;
//            }
//        }
//        return -1;
    static double sqrt(int n){
        int s=1;
        int e=n;
        double ans=-1;

        if(n==0){
            return 0;
        }
        while(s<=e){
            int mid=s+(e-s)/2;
            if(mid == n/mid){
                return mid;
            }
            else if(mid > n/mid){
                e=mid-1;
            }
            else{
                //mid < n/mid
                ans=mid;
                s=mid+1;
            }
        }
        double factor=1;
        int totalPrecision=3;
        for(int round = 1; round <= totalPrecision; round++){//rounds
            factor=factor/10;
            for (int i = 1; i <= 10; i++) {
                double newAns = ans + factor;

                if (newAns * newAns == n) {
                    return newAns;
                }
                if (newAns * newAns < n) {
                    ans = newAns;
                } else {
                    break;
                }
            }
        }
        double result=Math.round(ans*1000.0)/1000.0;
        return result;
    }
    static void main(String[] args) {
        System.out.println("Sqrt of n: " + sqrt(56));
    }
}

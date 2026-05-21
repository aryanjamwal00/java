public class BinarySearchLBUB {
    static int lowerBound(int arr[],int target){
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = n;

        while(s <= e){
            int mid = s + (e - s)/2;
            if(arr[mid] >= target){
                //store ans
                ans  = mid;
                //left move
                e = mid-1;
            }
            else{
                //arr[mid] < target
                //right move
                s = mid+1;
            }
        }
        return ans;
    }
    static int upperBound(int arr[],int target){
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int res = n;

        while(s <= e){
            int mid = s + (e - s)/2;
            if(arr[mid] <= target){
                //move right
                s = mid + 1;
            }
            else {
                //arr[mid]>target
                //res store
                res = mid;
                //move left
                e = mid - 1;
            }
        }
        return res;
    }
    static void main(String[] args) {
        int arr[] = {10,20,30,30,30,30,30,40,50};
        int ans = lowerBound(arr,30);
        int res = upperBound(arr,30);
        System.out.println("Lower Bound: " + ans);
        System.out.println("Upper Bound: " + res);
        System.out.println("No. of Occurrences: " +(res-ans));
    }
}

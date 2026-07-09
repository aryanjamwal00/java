public class BinarySearchUsingRecursion {
    public static int solve(int arr[],int s,int e,int target){
        //base caase
        if(s > e){
            return -1;
        }
        int mid = s + (e - s)/2;
        if(arr[mid] == target)
            return mid;

        if(arr[mid] >= target){
                //e = mid - 1;
            return solve(arr,s,mid-1,target);
        }
        else{
                //s = mid + 1;
            return solve(arr,mid+1,e,target);
        }
    }
    public static int binarySearchusingRecursion(int arr[], int target){
        int s = 0;
        int e = arr.length - 1;
        int ans = solve(arr,s,e,target);
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int ans = binarySearchusingRecursion(arr,6);
        System.out.println("Element fount at index:"+ans);
    }
}

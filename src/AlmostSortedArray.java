public class AlmostSortedArray {
    public static int findElementinAlmostSortedArray(int[] arr, int k){
        int s = 0;
        int e = arr.length-1;

        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid] - 1 >= 0 && arr[mid]-1 == k){
                return mid-1;
            }
            if(arr[mid] == k)
                return mid;
            if(arr[mid]+1 < e && arr[mid]+1 == k)
                return mid+1;

            if(arr[mid] < k){
                s=mid+1;
            }else{
                //arr[mid] > k
                e=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int ans = findElementinAlmostSortedArray(arr,6);
        System.out.println(ans);
    }
}

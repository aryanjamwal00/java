public class BinarySearch {
    static int binarySearch(int[] arr,int key){
        int n = arr.length;
        int start = 0;
        int end = n-1;

        while(start<=end) {
            int mid = start + (end-start)/2;
            if (key == arr[mid]) {
                //return the index as key is found
                return mid;
            } else if (key < arr[mid]) {
                //we will check to the left side of mid
                end = mid - 1;
            } else {
                //key > arr[mid]
                //we will check to the right side of mid
                start = mid + 1;
            }
        }
        return -1;
    }

    static void main(String[] args) {
        int[] arr={10,20,30,31,32,33,34,40,50,60,70,80,90};
        int ans=binarySearch(arr,34);
        System.out.println(ans);
    }
}

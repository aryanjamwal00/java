import java.util.Arrays;

public class MergeSort {
    static void mergeSort(int[] arr,int s,int e){
        //base case
        //invalid array or single element
        if(s>=e){
            return;
        }
        //break into 2 halves
        int mid = (s+e)/2;
        //lets sort the left half -> Recursion
        mergeSort(arr,s,mid);
        //lets sort the right half -> recursion
        mergeSort(arr,mid+1,e);
        //merge both the halves
        merge(arr,s,e,mid);
    }
    static void merge(int[] arr,int s,int e,int mid){
        int leftArrlength = (mid-s)+1;
        int rightArrlength = (e-mid);
        int leftArr[] = new int[leftArrlength];
        int rightArr[] = new int[rightArrlength];

        //copy down the left half of arr into leftArr
        int k = s;
        for(int i=0;i<leftArrlength;i++){
            leftArr[i] = arr[k];
            k++;
        }

        //copy doen the right half of arr into rightArr
        k = mid+1;
        for(int j=0;j<rightArrlength;j++){
            rightArr[j] = arr[k];
            k++;
        }

        //merge ka exact logic
        int i = 0;
        int j = 0;
        k = s;
        while(i<leftArrlength && j<rightArrlength){
            if(leftArr[i] < rightArr[j]){
                arr[k] = leftArr[i];
                i++;
                k++;
            }
            else{
                arr[k] = rightArr[j];
                j++;
                k++;
            }
        }
        //if left array is fully consumed and right is not
        //then copy rem. elements of right arr into ans arr
        while(j<rightArrlength){
            arr[k] = rightArr[j];
            j++;
            k++;
        }
        //if right array fully consumed and left is no
        //then copy rem element of left arr into ans arr
        while(i<leftArrlength){
            arr[k] = leftArr[i];
            i++;
            k++;
        }
    }
    static void main(String[] args) {
        int[] arr = {7,5,3,6,2,1,4,8};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}

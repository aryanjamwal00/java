import java.util.Arrays;

public class Sorting {
    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    static void selectionSort(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            //swap
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
    }

    static void insertionSort(int[] arr) {
        int n=arr.length;
        for (int i=1;i<n;i++){
            int current = i;
            int previous = i-1;
            int currentValue = arr[current];
            //shifting
            while(previous>=0 &&currentValue < arr[previous]){
                arr[previous+1] = arr[previous];
                previous--;
            }
            //fill the current value to vacant space
            arr[previous+1] = currentValue;
        }
    }
    static void main(String[] args) {
        int[] arr={6,5,1,3};
        //bubbleSort(arr);
        //selectionSort(arr);
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

import java.util.Arrays;

public class QuickSort {
    static void quickSort(int[] arr,int s,int e){
        //base case
        if(s>=e){
            return;
        }
        //partitioning
        int pivotIndex = partition(arr,s,e);
        //left part recursion se sort karlo
        quickSort(arr,s,pivotIndex-1);
        //right part recursion sa sort karlo
        quickSort(arr,pivotIndex+1,e);
    }
    private static int partition(int[] arr,int s,int e){
        //choose pivot index --> starting element,middle element or last element
        int pivotElement = arr[s];
        //iss pivot element ko iski correct position pe rkh do
        //count based approach(using rn),lomuto app,hoare app
        int count = 0;
        for(int i=s+1;i<=e;i++){
            if(arr[i] <= pivotElement){
                count++;
            }
        }
        //place pivot element at its correct position
        int correctPosition = s+count;
        //swap pivot element with element that is present at its correct position
        int temp = arr[s];
        arr[s] = arr[correctPosition];
        arr[correctPosition] = temp;
        //aab bs left aur right mein make sure krna hai ki chote aur bde element pivot ka hisaab se ho
        int i = s;
        int j = e;

        while(i<correctPosition && j>correctPosition){
            //left partmein jitne bi shi elemnets hai unko ignore kro aur i ko move kro
            while(arr[i] <= pivotElement){
                i++;
            }
            //right partmein jitne bi shi elemnets hai unko ignore kro aur j ko reverse move kro
            while(arr[j] > pivotElement){
                j--;
            }
            //aab aap aak ise jagah pe khde honge jha arr[i] aur arr[j] ko swap krna hai
            if(i<correctPosition && j>correctPosition){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return correctPosition;
    }

    static void main(String[] args) {
        int[] arr = {3,1,2,8,9};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}

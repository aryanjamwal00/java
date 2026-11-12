public class InversionCount {
    static int mergeSort(int[] arr,int s,int e){
        //base cases
        if(s>e){
            return 0;
        }
        if(s==e){
            return 0;
        }
        //2 part mein divide kro
        int mid = (s+e)/2;
        //left array ko hum recursion ko de denge
        int leftInversions = mergeSort(arr,s,mid);
        //right array ko hum recursion ko de denge
        int rightInversions = mergeSort(arr,mid+1,e);
        //merge both sorted parts
        int intermediateInversions = merge(arr,s,e,mid);
        int invCount = leftInversions + rightInversions + intermediateInversions;
        return invCount;
    }
    static int merge(int[] arr,int s,int e,int mid){
        //left array aur right array create kia the,
        //jisme humne original array se values copy ki thi
        int leftArrLen = (mid-s)+1;
        int rightArrLen = e-mid;

        int leftArr[] = new int[leftArrLen];
        int rightArr[] = new int[rightArrLen];

        int k = s;
        for(int i=0;i<leftArrLen;i++){
            leftArr[i] = arr[k];
            k++;
        }
        k = mid+1;
        for(int j=0;j<rightArrLen;j++){
            rightArr[j] = arr[k];
            k++;
        }
        //merge ka logic
        int i = 0;
        int j = 0;
        k = s;
        int inversionCount = 0;
        while(i<leftArrLen && j<rightArrLen){
            if(leftArr[i] <= rightArr[j]){
                arr[k] = leftArr[i];
                k++;
                i++;
            }
            else{
                //leftArr[i] > rightArr[j]
                //merge valla logic
                arr[k] = rightArr[j];
                j++;
                k++;
                //inversion ka logic
                inversionCount = inversionCount + (leftArrLen - i);
            }
        }
        while(i<leftArrLen){
            arr[k] = leftArr[i];
            k++;
            i++;
        }
        while(j<rightArrLen){
            arr[k] = rightArr[j];
            j++;
            k++;
        }
        //inversion count return kr do
        return inversionCount;
    }
    static int inversionCount(int[] arr){
        int s = 0;
        int e = arr.length-1;
        int ans = mergeSort(arr,s,e);
        return ans;
    }
    static void main(String[] args) {
        int arr[] = {2,4,1,3,5};
        System.out.println(inversionCount(arr));
    }
}

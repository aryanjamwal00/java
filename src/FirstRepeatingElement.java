import java.util.HashMap;

public class FirstRepeatingElement {
    static int findFirstRepeatingElement(int[] arr){
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i:arr){
            freq.put(i, freq.getOrDefault(i,0)+1);
        }
        for(int i:arr){
            if(freq.get(i) > 1){
                return i;
            }
        }
        return -1;
    }
    static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,4};
        System.out.println(findFirstRepeatingElement(arr));
    }
}

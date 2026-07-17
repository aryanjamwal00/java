import java.util.ArrayList;
import java.util.List;

public class SubsequenceOfAString {
    static void getAllSubsequences(String s,int index,StringBuilder output,List<String> ans){
        //base case
        if(index >= s.length()){
            String sequence = output.toString();
            ans.add(sequence);
            return;
        }

        char ch = s.charAt(index);
        //include
        output.append(ch);
        getAllSubsequences(s,index+1,output,ans);

        //exclude
        output.deleteCharAt(output.length()-1);
        getAllSubsequences(s,index+1,output,ans);
    }
    static List<String> powerSet(String s){
        List<String> ans = new ArrayList<>();
        StringBuilder output = new StringBuilder();
        int index = 0;

        getAllSubsequences(s,index,output,ans);
        return ans;
    }

    static void main(String[] args) {
        String s = "abc";
        List<String> ans = powerSet(s);
        System.out.println(ans);
    }
}

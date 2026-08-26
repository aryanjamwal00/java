import java.util.ArrayList;
import java.util.List;

public class LetterCombinationofPhoneNumber {
    public static void solve(String digits,String[] mapping,int index,List<String> result,StringBuilder output){
        //base case --> jaise hi index input string se bhr jaiga
        //iska mtlb,output string ready h to push inside result wali list
        if(index >= digits.length()){
            result.add(output.toString());
            return;
        }
        //1 case muje solve krna h,iska mtlb ek block mein
        //fill kr deta hu baaki recursion smbhal lega
        int value = digits.charAt(index) - '0';
        String mappedString = mapping[value];
        //current value and uski mapped string mere pss ready h
        //current block pr use rkh dete h and baaki recursion ko de denge
        for(int i=0;i<mappedString.length();i++){
            output.append(mappedString.charAt(i));
            solve(digits,mapping,index+1,result,output);
            //Backtracking
            output.deleteCharAt(output.length()-1);
        }
    }
    public static List<String> letterCombinations(String digits) {
        String[] mapping = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        int index = 0;
        List<String> result = new ArrayList<>();
        StringBuilder output = new StringBuilder();
        solve(digits,mapping,index,result,output);
        return result;
    }
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
}

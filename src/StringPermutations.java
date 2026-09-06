import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class StringPermutations {
    static void solve(String s,String output,ArrayList<String> ans){
        //base case
        //agr mere input string or remain string empty aayi h
        //iska mtlb output string mein permutation bn gye hai ans mein store kro
        if(s.isEmpty()){
            ans.add(output);
            return;
        }
        //hr ch ko har position pa try kro
        //and baaki recursion smbhal lega
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            String remString = s.substring(0,i)+s.substring(i+1);
            //baki rec dekh lega
            solve(remString,output+ch,ans);
        }
    }
    static ArrayList<String> permutation(String s){
        ArrayList<String> ans = new ArrayList<>();
        solve(s,"",ans);
        Collections.sort(ans);
        return ans;
    }
    public static void main(String[] args) {
        String s = "ABC";
        System.out.println(permutation(s));
    }
}

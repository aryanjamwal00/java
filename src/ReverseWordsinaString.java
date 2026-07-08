public class ReverseWordsinaString {
    static String reverseString(String s){
        StringBuilder ans = new StringBuilder();
        int i = s.length()-1;

        while(i >= 0){
            //remove all the trailing spaces
            while(i >= 0 && s.charAt(i) == ' '){
                i--;
            }
            //check value of i
            if(i < 0){
                break;
            }
            int j = i;
            //find the start index of the word
            while(j >= 0 && s.charAt(j) != ' '){
                j--;
            }
            //jaise he j space pe aya STOP!
            //iss word ko ans pe append kr dena
            ans.append(s.substring(j+1,i+1));
            //remove extra spaces where j is standing and add space in ans
            while(j >= 0 && s.charAt(j) == ' '){
                j--;
            }//j<0 iska mtlb first word ka upr, j>=0 space needed
            if(j >= 0){
                ans.append(' ');
            }
            //place i at last index of the remaining string
            i = j;
        }
        return ans.toString();
    }

    static void main(String[] args) {
        String s = "My name is Aryan Jamwal";
        String ans = reverseString(s);
        System.out.println("Reverse of a String is: " +ans);
    }
}
